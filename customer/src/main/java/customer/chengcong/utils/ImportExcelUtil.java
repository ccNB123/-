package customer.chengcong.utils;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportExcelUtil {
	
	private final static String excel2003L=".xls";  //2003-版本excel
	private final static String excel2007U=".xlsx"; //2007+版本excel

	public static List<List<Object>> getBankListByExcel(InputStream in,String fileName) throws Exception{
		List<List<Object>> list = null;
		
		Workbook work = getWorkbook(in,fileName);
		if(work == null){
			throw new Exception("创建Excel工作簿为空!");
		}
		Sheet sheet = null;
		Row row = null;
		Cell cell = null;
		list = new ArrayList<List<Object>>();
		for(int i = 0; i < work.getNumberOfSheets(); i++){
			sheet = work.getSheetAt(i);
			if(sheet == null){
				continue;
			}
			for(int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum();j++){
				row = sheet.getRow(j);
				if(row == null || row.getFirstCellNum()==j || "会员卡号".equals(row.getCell(0).getStringCellValue())){
					continue;
				}
				List<Object> li =new ArrayList<Object>();
				for(int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++){
					cell = row.getCell(y);
					li.add(getCellValue(cell));
				}
				list.add(li);
			}
		}
		return list;
		
		
	}
	
	public static Workbook getWorkbook(InputStream inStr,String fileName) throws Exception{
		Workbook wb = null;
		String fileType = fileName.substring(fileName.lastIndexOf("."));
		if(excel2003L.equals(fileType)){
			wb = new HSSFWorkbook(inStr);     //2003-版本excel
		}else if(excel2007U.equals(fileType)){
			wb = new XSSFWorkbook(inStr);    ///2007+版本excel
		}else{
			throw new Exception("解析的文件格式有误!");
		}
		return wb;
		
	}
	
	public static Object getCellValue(Cell cell){
		Object value = null;
		DecimalFormat df = new DecimalFormat("0");      //格式化number String字符
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");    //日期格式化
		DecimalFormat df2 = new DecimalFormat("0.00");   //格式化数字
		switch(cell.getCellType()){
		case Cell.CELL_TYPE_STRING:
			value = cell.getRichStringCellValue().getString();
			break;
		case Cell.CELL_TYPE_NUMERIC:
			value = df.format(cell.getNumericCellValue());
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			value = cell.getBooleanCellValue();
			break;
		case Cell.CELL_TYPE_BLANK:
			value ="";
			break;
			default:
				break;
		}
		return value;
		
	}
}
