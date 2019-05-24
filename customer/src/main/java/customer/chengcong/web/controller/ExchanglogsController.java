package customer.chengcong.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import customer.chengcong.entity.Exchanglogs;
import customer.chengcong.entity.Memcards;
import customer.chengcong.service.IExchanglogsService;
import customer.chengcong.service.IMemcardsService;

@Controller
@RequestMapping("/log")
public class ExchanglogsController {
	
	@Autowired
	private IExchanglogsService exchanglogsService;
	
	@Autowired
	private IMemcardsService memcardsSerivce;

	
	@RequestMapping("/addExchang")
	@ResponseBody
	public void addExchang(Memcards memcard,String rows) {
		exchanglogsService.addexchangLog(memcard,rows);
	}
	
	@RequestMapping("/tologs")
	public String tologs(Model model) {
		
		return "main/exchangLogs";
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public Object select(@RequestParam("page") int pageNo,@RequestParam("rows") int pageSize,Exchanglogs log) {
		Memcards mem = memcardsSerivce.selectByCardid(log.getMemcardsCardid() == null?"":log.getMemcardsCardid());
		PageHelper.startPage(pageNo, pageSize);
		List<Exchanglogs> list=exchanglogsService.selectAll(mem == null?"":mem.getMemcardsCardid());
		
		PageInfo info = new PageInfo(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", info.getList());
		map.put("total", info.getTotal());
		return map;
	}
}
