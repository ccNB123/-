package customer.chengcong.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import customer.chengcong.entity.Categories;
import customer.chengcong.entity.Shops;
import customer.chengcong.entity.Users;
import customer.chengcong.service.ICategoriesService;
import customer.chengcong.service.IShopsService;
import customer.chengcong.service.IUsersService;

@Controller
@RequestMapping("/shop")
public class ShopsController {

	@Autowired
	private IShopsService shopService;
	
	@Autowired
	private ICategoriesService categoriesService;
	
	@Autowired
	private IUsersService userService;
	
	@RequestMapping("/select")
	@ResponseBody
	public Object select(@RequestParam("page") int pageNo,@RequestParam("rows") int pageSize,Shops shop) {
		PageHelper.startPage(pageNo, pageSize);
		List<Shops> list=shopService.selectAll(shop);
		
		PageInfo info = new PageInfo(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", info.getList());
		map.put("total", info.getTotal());
		return map;
	}
	
	@RequestMapping("/toadd")
	public String toadd(Model model) {
		List<Categories> categoriesList = categoriesService.selectByName("SP_Category");
		model.addAttribute("categoriesList", categoriesList);
		return "main/addshop";
	}
	
	@RequestMapping("/insert")
	public String insert(Shops shop) {
		shopService.insert(shop);
		return "main/shop";	
	}
	
	@RequestMapping("/toupdate")
	public String toupdate(Model model,int shopId) {
		Shops shop = shopService.selectById(shopId);
		List<Categories> categoriesList = categoriesService.selectByName("SP_Category");
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("shop", shop);
		return "main/updateshop";
	}
	
	@RequestMapping("/update")
	public String update(Shops shop) {
		shopService.update(shop);
		return "main/shop";	
	}
	
	@RequestMapping("/delete")
	public void delete(Shops shop,HttpServletResponse response) {
		if(shop !=null) {
			boolean isSuccess=shopService.delete(shop.getShopId());
			response.setCharacterEncoding("utf-8");
			PrintWriter out = null;
			try {
				out=response.getWriter();
				if(isSuccess) {
					out.print("删除成功");
				}else {
					out.print("删除失败");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}finally {
				if(out !=null) {
					out.flush();
					out.close();
				}
			}
		}
	}
	
	@RequestMapping("/toaddUser")
	public String addUser(Model model,Shops shop) {
		model.addAttribute("shop", shop);
		return "main/ishassetadmin";
	}
	
	@RequestMapping("/addUser")
	public String addUser(Users user) {
		user.setUsersPassword("123456");
		user.setUsersRole(110);
		userService.insert(user);
		Shops shop=new Shops();
		shop.setShopId(user.getShopId());
		shop.setShopIshassetadmin(Shops.HAS_ADMIN);
		shopService.update(shop);
		return "main/shop";
	}
}
