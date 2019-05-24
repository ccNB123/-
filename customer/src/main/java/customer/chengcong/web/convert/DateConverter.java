package customer.chengcong.web.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String,Date>{

	private SimpleDateFormat[] sdfs=new SimpleDateFormat[]{
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),
			new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyy/MM/dd"),
			new SimpleDateFormat("MM/dd/yyyy"),
			new SimpleDateFormat("yyyy.MM.dd"),
		};
		
		public Date convert(String source) {
			for(int i=0;i < sdfs.length; i++){
				try {
					return sdfs[i].parse(source);
				} catch (ParseException e) {
					continue;
				}
			}
			throw new IllegalArgumentException("无效日期格式,请使用这种格式:yyyy-mm-dd");
			
		}
}
