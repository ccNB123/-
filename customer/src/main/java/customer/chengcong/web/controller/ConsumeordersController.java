package customer.chengcong.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import customer.chengcong.entity.Consumeorders;
import customer.chengcong.entity.Exchanglogs;
import customer.chengcong.entity.Memcards;
import customer.chengcong.entity.Shops;
import customer.chengcong.service.IConsumeordersService;
import customer.chengcong.service.IMemcardsService;

@Controller
@RequestMapping("/con")
public class ConsumeordersController {
	
	@Autowired
	private IConsumeordersService consumeordersService;
	
	@Autowired
	private IMemcardsService memcardsSerivce;

	@RequestMapping("/topointMoney")
	public String topointMoney() {
		return "main/pointMoney";
	}
	
	@RequestMapping("/updatePoint")
	public String updatePoint(Consumeorders con,int memcardsId) {
		consumeordersService.updatePoint(con,memcardsId);
		return "main/pointMoney";
	}
	
	@RequestMapping("/toconsume")
	public String toconsume() {
		return "main/fastConsume";
	}
	
	@RequestMapping("/consume")
	public String consume(Consumeorders con,int memcardsId) {
		consumeordersService.updateConsume(con,memcardsId);
		return "main/fastConsume";
	}
	
	@RequestMapping("/tominus")
	public String tominus() {
		return "main/minusPoint";
	}
	
	@RequestMapping("/minusPoint")
	public String minusPoint(Consumeorders con,int memcardsId) {
		consumeordersService.updateminusPoint(con,memcardsId);
		return "main/minusPoint";
	}
	
	@RequestMapping("/tocon")
	public String tocon() {
		return "main/consumeorder";
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public Object select(@RequestParam("page") int pageNo,@RequestParam("rows") int pageSize,Consumeorders con) {
		Memcards mem = memcardsSerivce.selectByCardid(con.getMemcardsCardid() == null?"":con.getMemcardsCardid());
		PageHelper.startPage(pageNo, pageSize);
		List<Consumeorders> list=consumeordersService.selectAll(mem == null?"":mem.getMemcardsCardid());
		
		PageInfo info = new PageInfo(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", info.getList());
		map.put("total", info.getTotal());
		return map;
	}
}
