package customer.chengcong.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import customer.chengcong.entity.Categories;
import customer.chengcong.entity.Users;
import customer.chengcong.service.ICategoriesService;
import customer.chengcong.service.IUsersService;

@Controller
@RequestMapping("/user")
public class UsersController {

	@Autowired
	private IUsersService usersService;
	
	@Autowired
	private ICategoriesService categoriesService;
	
	@RequestMapping("/login")
	public String login(Users user,HttpSession session) {
		String forward="main/main";
		user=usersService.login(user);
		if(user == null) {
			forward="redirect:/login.jsp";
		}else {
			session.setAttribute("LOGIN", user);
		}
		return forward;
	}
	
	@RequestMapping("/touname")
	public String touname(HttpSession session,Model model) {
		Users user=(Users)session.getAttribute("LOGIN");
		user = usersService.selectById(user.getUsersId());
		List<Categories> categoriesList = categoriesService.selectByName("SR_UserCategory");
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("user", user);
		return "main/updateUname";
	}
	
	@RequestMapping("/updateuname")
	public String updateuname(Users user) {
		usersService.update(user);
		return "main/main";	
	}
	
	@RequestMapping("/toupdatepwd")
	public String toupdatepwd(HttpSession session,Model model) {
		Users user=(Users)session.getAttribute("LOGIN");
		model.addAttribute("user", user);
		return "main/updatePwd";
	}
	
	@RequestMapping("topwd")
    @ResponseBody
    public boolean topwd(HttpSession session,String oldpassword) {
    	Users user=(Users)session.getAttribute("LOGIN");
    	if(oldpassword.equals(user.getUsersPassword())) {
    		return true;
    	}else {
    		return false;
    	}
    }
	
	@RequestMapping("/updatepwd")
	public String updatepwd(Users user) {
		usersService.update(user);
		return "redirect:/main/user.jsp";	
	}
	
	@RequestMapping("/toshop")
	public String toshop() {
		return "main/shop";
	}
	
	@RequestMapping("/touser")
	public String touser() {
		return "main/user";
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public Object select(@RequestParam("page") int pageNo,@RequestParam("rows") int pageSize,Users user) {
		PageHelper.startPage(pageNo, pageSize);
		List<Users> list=usersService.selectAll(user);
		
		PageInfo info = new PageInfo(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", info.getList());
		map.put("total", info.getTotal());
		return map;
	}
	
	@RequestMapping("/toadd")
	public String toadd(Model model) {
		List<Categories> categoriesList = categoriesService.selectByName("SR_UserCategory");
		model.addAttribute("categoriesList", categoriesList);
		return "main/addUser";
	}
	
	@RequestMapping("/insert")
	public String insert(Users user) {
		usersService.insert(user);
		return "main/user";	
	}
	
	@RequestMapping("/toupdate")
	public String toupdate(Model model,int usersId) {
		Users user = usersService.selectById(usersId);
		List<Categories> categoriesList = categoriesService.selectByName("SR_UserCategory");
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("user", user);
		return "main/updateUser";
	}
	
	@RequestMapping("/update")
	public String update(Users user) {
		usersService.update(user);
		return "main/user";	
	}
	
	@RequestMapping("/delete")
	public void delete(Users user,HttpServletResponse response) {
		if(user !=null) {
			boolean isSuccess=usersService.delete(user.getUsersId());
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
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/login.jsp";
		
	}
}
