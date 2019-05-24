package customer.chengcong.web.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import customer.chengcong.entity.Exchanggifts;
import customer.chengcong.service.IExchanggiftsService;

@Controller
@RequestMapping("/gift")
public class ExchanggiftsController {

	@Autowired
	private IExchanggiftsService exchanggiftsService;
	
	@RequestMapping("/togift")
	public String togift() {
		return "main/exchanggifts";
	}
	
	@RequestMapping("/topointExchang")
	public String topoint() {
		return "main/pointGift";
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public Object select(@RequestParam("page") int pageNo,@RequestParam("rows") int pageSize,Exchanggifts gift) {
		PageHelper.startPage(pageNo, pageSize);
		List<Exchanggifts> list=exchanggiftsService.selectAll(gift);
		
		PageInfo info = new PageInfo(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", info.getList());
		map.put("total", info.getTotal());
		return map;
	}
	
	@RequestMapping("/toadd")
	public String toadd(Model model) {
		return "main/addExchanggifts";
	}
	
	@RequestMapping("/insert")
	public String insert(HttpServletRequest request,@RequestParam(value="file",required=false)MultipartFile excelFile,Exchanggifts gift) {
		File targetFile = null;
		if(excelFile != null){
			String targetDir = request.getSession().getServletContext().getRealPath("/upload/");
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			String filename = cal.get(Calendar.YEAR)+""+ (cal.get(Calendar.MONTH)+1)+cal.get(Calendar.DAY_OF_MONTH)+cal.get(Calendar.HOUR_OF_DAY)+cal.get(Calendar.MINUTE)+cal.get(Calendar.MILLISECOND)+".jpg";
			File fileDir = new File(targetDir);
			if(fileDir.exists()){
				fileDir.mkdirs();
			}
			targetFile = new File(fileDir,filename);
			try {
				excelFile.transferTo(targetFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			gift.setExchanggiftsPhoto(filename);
		}
		exchanggiftsService.insert(gift);
		return "main/exchanggifts";	
	}
	
	@RequestMapping("/toupdate")
	public String toupdate(Model model,int exchanggiftsId) {
		Exchanggifts gift = exchanggiftsService.selectById(exchanggiftsId);
		model.addAttribute("exchanggifts", gift);
		return "main/updateExchanggifts";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request,@RequestParam(value="file",required=false)MultipartFile excelFile,Exchanggifts gift) {
		File targetFile = null;
		if(excelFile != null){
			String targetDir = request.getSession().getServletContext().getRealPath("/upload/");
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			String filename = cal.get(Calendar.YEAR)+""+ (cal.get(Calendar.MONTH)+1)+cal.get(Calendar.DAY_OF_MONTH)+cal.get(Calendar.HOUR_OF_DAY)+cal.get(Calendar.MINUTE)+cal.get(Calendar.MILLISECOND)+".jpg";
			File fileDir = new File(targetDir);
			if(fileDir.exists()){
				fileDir.mkdirs();
			}
			targetFile = new File(fileDir,filename);
			try {
				excelFile.transferTo(targetFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			gift.setExchanggiftsPhoto(filename);
		}
		exchanggiftsService.update(gift);
		return "main/exchanggifts";
	}
	
	@RequestMapping("/delete")
	public void delete(Exchanggifts gift,HttpServletResponse response) {
		if(response !=null) {
			boolean isSuccess=exchanggiftsService.delete(gift.getExchanggiftsId());
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
