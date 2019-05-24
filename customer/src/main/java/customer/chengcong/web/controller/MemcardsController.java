package customer.chengcong.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import customer.chengcong.entity.Cardlevels;
import customer.chengcong.entity.Categories;
import customer.chengcong.entity.Memcards;
import customer.chengcong.entity.Transferlogs;
import customer.chengcong.service.ICardlevelsService;
import customer.chengcong.service.ICategoriesService;
import customer.chengcong.service.IMemcardsService;
import customer.chengcong.service.ITransferlogsService;
import customer.chengcong.utils.ImportExcelUtil;
import customer.chengcong.web.convert.DateConverter;

@Controller
@RequestMapping("/mem")
public class MemcardsController {

	@Autowired
	private IMemcardsService memcardsService;
	
	@Autowired
	private ICategoriesService categoriesService;
	
	@Autowired
	private ICardlevelsService cardlevelsService;
	
	@Autowired
	private ITransferlogsService transferlogsService;
	
	@RequestMapping("/tomem")
	public String tomem(Model model) {
		List<Categories> categoriesList = categoriesService.selectByName("CD_State");
		List<Cardlevels> cardlevels = cardlevelsService.select();
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("cardlevels", cardlevels);
		return "main/memcards";
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public Object select(@RequestParam("page") int pageNo,@RequestParam("rows") int pageSize,Memcards memcard) {
		PageHelper.startPage(pageNo, pageSize);
		List<Memcards> list=memcardsService.selectAll(memcard);
		
		PageInfo info = new PageInfo(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", info.getList());
		map.put("total", info.getTotal());
		return map;
	}
	
	@RequestMapping("/toadd")
	public String toadd(Model model) {
		List<Categories> categoriesList = categoriesService.selectByName("CD_State");
		List<Cardlevels> cardlevels = cardlevelsService.select();
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("cardlevels", cardlevels);
		return "main/addMemcards";
	}
	
	@RequestMapping("/screch")
	@ResponseBody
	public Object select(String memcardsReferercard) {
		Memcards memcard = memcardsService.selectByCardid(memcardsReferercard);
		if(memcard == null){
			memcard = new Memcards();
			memcard.setMemcardsId(-1);
		}
		return memcard;
	}
	
	@RequestMapping("/insert")
	public String insert(Memcards memcard) {
		Date date = new Date();
		memcard.setMemcardsCreatetime(date);
		memcardsService.insert(memcard);
		return "main/memcards";	
	}
	
	@RequestMapping("/toupdate")
	public String toupdate(Model model,int memcardsId) {
		Memcards memcard = memcardsService.selectById(memcardsId);
		List<Categories> categoriesList = categoriesService.selectByName("CD_State");
		List<Cardlevels> cardlevels = cardlevelsService.select();
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("cardlevels", cardlevels);
		model.addAttribute("memcard", memcard);
		return "main/updateMemvards";
	}
	
	@RequestMapping("/update")
	public String update(Memcards memcard) {
		memcardsService.update(memcard);
		return "main/memcards";	
	}
	
	@RequestMapping("/delete")
	public void delete(Memcards memcard,HttpServletResponse response) {
		if(memcard !=null) {
			boolean isSuccess=memcardsService.delete(memcard.getMemcardsId());
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
	
	@RequestMapping("/tostate")
	public String tostate(Model model,int memcardsId) {
		Memcards memcard = memcardsService.selectById(memcardsId);
		List<Categories> categoriesList = categoriesService.selectByName("CD_State");
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("memcard", memcard);
		return "main/updateState";
	}
	
	@RequestMapping("/updateState")
	public String updateState(Memcards memcard) {
		memcardsService.update(memcard);
		return "main/memcards";	
	}
	
	@RequestMapping("/tomove")
	public String tomove(Model model,int memcardsId) {
		Memcards memcard = memcardsService.selectById(memcardsId);
		model.addAttribute("memcard", memcard);
		return "main/move";
	}
	
	@RequestMapping("/addTransfer")
	public String addTransfer(Transferlogs transferlog) {
		transferlogsService.add(transferlog);
		return "main/memcards";	
	}
	
	@RequestMapping("/toexchange")
	public String toexchane(Model model,int memcardsId) {
		Memcards memcard = memcardsService.selectById(memcardsId);
		model.addAttribute("memcard", memcard);
		return "main/exchangCard";
	}
	
	@RequestMapping("/ReloadPwd")
	@ResponseBody
	public Integer ReloadPwd(int memcardsId,String memcardsPassword) {
		Memcards memcard = memcardsService.selectById(memcardsId);
		if(memcard.getMemcardsPassword().equals(memcardsPassword)){
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("/export")
	public void  toexcel(HttpServletRequest request,HttpServletResponse response){
		List<Memcards> list=memcardsService.selectAll(null);
		
		HSSFWorkbook wb=new HSSFWorkbook();
		
		HSSFSheet sheet=wb.createSheet("会员信息表");
		int index=0;
		sheet.setColumnWidth(index++, 256*18+184);
		sheet.setColumnWidth(index++, 256*18+184);
		sheet.setColumnWidth(index++, 256*9+184);
		sheet.setColumnWidth(index++, 256*18+184);
		sheet.setColumnWidth(index++, 256*9+184);
		sheet.setColumnWidth(index++, 256*9+184);
		sheet.setColumnWidth(index++, 256*9+184);
		sheet.setColumnWidth(index++, 256*18+184);
		sheet.setColumnWidth(index++, 256*18+184);
		sheet.setColumnWidth(index++, 256*18+184);
		sheet.setColumnWidth(index++, 256*18+184);
		sheet.setColumnWidth(index++, 256*18+184);
		sheet.setColumnWidth(index++, 256*18+184);
		sheet.setColumnWidth(index++, 256*18+184);
		HSSFRow row=sheet.createRow(0);
		HSSFCellStyle style_top_left=wb.createCellStyle();
		HSSFCellStyle style_top_center=wb.createCellStyle();
		HSSFCellStyle style_top_right=wb.createCellStyle();
		
		Font font=wb.createFont();
		font.setFontHeightInPoints((short)12);
		font.setFontName("微软雅黑");
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		font.setColor(HSSFColor.WHITE.index);
		
		style_top_left.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		style_top_left.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style_top_left.setFont(font);
		
		style_top_center.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		style_top_center.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style_top_center.setFont(font);
		
		style_top_right.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		style_top_right.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style_top_right.setFont(font);
		
		HSSFCellStyle style_center_left=wb.createCellStyle();
		HSSFCellStyle style_center_center=wb.createCellStyle();
		HSSFCellStyle style_center_right=wb.createCellStyle();
		
		HSSFCellStyle style_buttom_left=wb.createCellStyle();
		HSSFCellStyle style_buttom_center=wb.createCellStyle();
		HSSFCellStyle style_buttom_right=wb.createCellStyle();
		
		style_top_center.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style_top_left.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style_top_right.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style_center_center.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style_center_left.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style_center_right.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style_buttom_center.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style_buttom_left.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style_buttom_right.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		
		style_top_left.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style_top_left.setBorderLeft(HSSFCellStyle.BORDER_THICK);
		style_top_left.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style_top_left.setBorderTop(HSSFCellStyle.BORDER_THICK);
		
		style_top_center.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style_top_center.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style_top_center.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style_top_center.setBorderTop(HSSFCellStyle.BORDER_THICK);
		
		style_top_right.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style_top_right.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style_top_right.setBorderRight(HSSFCellStyle.BORDER_THICK);
		style_top_right.setBorderTop(HSSFCellStyle.BORDER_THICK);
		
		style_center_left.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style_center_left.setBorderLeft(HSSFCellStyle.BORDER_THICK);
		style_center_left.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style_center_left.setBorderTop(HSSFCellStyle.BORDER_THICK);
		
		style_buttom_left.setBorderBottom(HSSFCellStyle.BORDER_THICK);
		style_buttom_left.setBorderLeft(HSSFCellStyle.BORDER_THICK);
		style_buttom_left.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style_buttom_left.setBorderTop(HSSFCellStyle.BORDER_THIN);
		
		style_buttom_center.setBorderBottom(HSSFCellStyle.BORDER_THICK);
		style_buttom_center.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style_buttom_center.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style_buttom_center.setBorderTop(HSSFCellStyle.BORDER_THIN);
		
		style_buttom_right.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style_buttom_right.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style_buttom_right.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style_buttom_right.setBorderTop(HSSFCellStyle.BORDER_THIN);
		
		int nIndex=0;
		HSSFCell cell=row.createCell(nIndex);
		cell.setCellValue("会员卡号");
		cell.setCellStyle(style_top_left);
		cell=row.createCell(++nIndex);
		cell.setCellValue("姓名");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("性别");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("电话");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("生日类型");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("月");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("日");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("登记时间");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("会员等级ID");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("会员等级");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("会员卡状态ID");
		cell.setCellStyle(style_top_center);
		cell=row.createCell(++nIndex);
		cell.setCellValue("会员卡状态");
		cell.setCellStyle(style_top_center);
		
		nIndex=0;
		for(int i=0;i<list.size();i++,nIndex=0) {
			row=sheet.createRow(i+1);
			Memcards mem=list.get(i);
			HSSFCell c=row.createCell(nIndex++);
			c.setCellValue(mem.getMemcardsCardid());
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_left);
			}else {
				c.setCellStyle(style_center_left);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getMemcardsName());
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue("0".equals(mem.getMemcardsSex())?"男":"女");
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getMemcardsMobile());
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getMemcardsBirthdaytype()==null||mem.getMemcardsBirthdaytype()==0?"公历":"农历");
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getMemcardsBirthdayMonth());
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getMemcardsBirthdayDay());
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getMemcardsCreatetime()!=null?new SimpleDateFormat("yyyy-MM-dd").format(mem.getMemcardsCreatetime()):"");
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getCardlevels().getCardlevelsId());
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getCardlevels().getCardlevelsLevelname());
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getMemcardsState());
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_center);
			}else {
				c.setCellStyle(style_center_center);
			}
			
			c=row.createCell(nIndex++);
			c.setCellValue(mem.getCategories().getCategoryTitle());
			if(i==list.size()-1) {
				c.setCellStyle(style_buttom_right);
			}else {
				c.setCellStyle(style_center_right);
			}
		}
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		String filename=cal.get(Calendar.YEAR)+""+(cal.get(Calendar.MONTH)+1)+cal.get(Calendar.DAY_OF_MONTH)+"会员列表.xls";
		      try {
				filename=encodeChineseDownloadFileName(request,filename);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      response.setHeader("Content-disposition", filename);
		      response.setContentType("application/vnd.ms-excel");
		      response.setHeader("Content-disposition","attachment;filename="+ filename);
		      response.setHeader("Pragma", "No-cache");
		      OutputStream outputStream=null;
		      
		      try {
				outputStream=response.getOutputStream();
				wb.write(outputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					outputStream.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		    return;  
	}
	
	 public static String encodeChineseDownloadFileName(HttpServletRequest request,String pFileName) throws UnsupportedEncodingException {
		 String filename=null;
		 String agent=request.getHeader("USER-AGENT");
		 if(null!=agent) {
			 if(-1!=agent.indexOf("Firefox")) {
				 filename="=?UTF-8?8?"
						 +(new String(org.apache.commons.codec.binary.Base64.encodeBase64(pFileName.getBytes("UTF-8"))))
						 +"?=";
			 }else if(-1!=agent.indexOf("Chorme")) {
				 filename=new String(pFileName.getBytes(),"ISO8859-1");
			 }else{
				 filename=java.net.URLEncoder.encode(pFileName, "UTF-8");
				 filename=filename.replace("+", "20%");
			 }
		 }else {
			 filename=pFileName;
		 }
		 return filename;
	 }
	 
	
	@RequestMapping("/toimport")
	public String toimport() {
		return "main/import";
	}
	
	@RequestMapping("/importExcel")
	public String importExcel(HttpServletRequest request,@RequestParam(value="file",required=false)MultipartFile excelFile) {
		File targetFile = null;
		if(excelFile != null){
			String targetDir = request.getSession().getServletContext().getRealPath("/upload/");
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			String filename = cal.get(Calendar.YEAR)+""+ (cal.get(Calendar.MONTH)+1)+cal.get(Calendar.DAY_OF_MONTH)+cal.get(Calendar.HOUR_OF_DAY)+cal.get(Calendar.MINUTE)+cal.get(Calendar.MILLISECOND)+"._会员列表.xls";
			File fileDir = new File(targetDir);
			if(fileDir.exists()){
				fileDir.delete();
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
			
			List<List<Object>> objects = null;
			
			try {
				objects = ImportExcelUtil.getBankListByExcel(new FileInputStream(targetFile),targetFile.getName());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<Memcards> memcardsList = transferToMemcard(objects);
			memcardsService.importExcel(memcardsList);
		}
		
		return "main/memcards";
	}
	
	private List<Memcards> transferToMemcard(List<List<Object>> objects){
		DateConverter dateConverter = new DateConverter();
		List<Memcards> memcardsList = new ArrayList<Memcards>();
		
		for(int i = 0; i< objects.size(); i++){
			List<Object> lo = objects.get(i);
			
			Memcards mem = new Memcards();
			mem.setMemcardsCardid((String)lo.get(0));
			mem.setMemcardsName((String)lo.get(1));
			mem.setMemcardsSex("男".equals((String)lo.get(2))?"0":"1");
			mem.setMemcardsMobile((String)lo.get(3));
			mem.setMemcardsBirthdaytype("公历".equals((String)lo.get(4))?1:0);
			mem.setMemcardsBirthdayMonth(Integer.parseInt((String)lo.get(5)));
			mem.setMemcardsBirthdayDay(Integer.parseInt((String)lo.get(6)));
			mem.setMemcardsCreatetime(dateConverter.convert((String)lo.get(7)));
			mem.setCardlevelsId(Integer.parseInt((String)lo.get(8)));
			mem.setMemcardsState(Integer.parseInt((String)lo.get(10)));
			memcardsList.add(mem);
		}
		return memcardsList;
		
	}
	
}
