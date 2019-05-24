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

import customer.chengcong.entity.Cardlevels;
import customer.chengcong.entity.Shops;
import customer.chengcong.service.ICardlevelsService;

@Controller
@RequestMapping("/card")
public class CardlevelsController {

	@Autowired
	private ICardlevelsService cardlevelsService;
	
	@RequestMapping("/select")
	@ResponseBody
	public Object select(@RequestParam("page") int pageNo,@RequestParam("rows") int pageSize,Cardlevels cardlevels) {
		PageHelper.startPage(pageNo, pageSize);
		List<Cardlevels> list=cardlevelsService.selectAll(cardlevels);
		
		PageInfo info = new PageInfo(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", info.getList());
		map.put("total", info.getTotal());
		return map;
	}
	
	@RequestMapping("/tocard")
	public String toshop() {
		return "main/cardlevels";
	}
	
	@RequestMapping("/toadd")
	public String toadd(Model model) {
		return "main/addCardlevels";
	}
	
	@RequestMapping("/insert")
	public String insert(Cardlevels cardlevels) {
		cardlevelsService.insert(cardlevels);
		return "main/cardlevels";	
	}
	
	@RequestMapping("/toupdate")
	public String toupdate(Model model,int cardlevelsId) {
		Cardlevels cardlevels = cardlevelsService.selectById(cardlevelsId);
		model.addAttribute("cardlevels", cardlevels);
		return "main/updateCardlevels";
	}
	
	@RequestMapping("/update")
	public String update(Cardlevels cardlevels) {
		cardlevelsService.update(cardlevels);
		return "main/cardlevels";
	}
	
	@RequestMapping("/delete")
	public void delete(Cardlevels cardlevels,HttpServletResponse response) {
		if(response !=null) {
			boolean isSuccess=cardlevelsService.delete(cardlevels.getCardlevelsId());
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
}
