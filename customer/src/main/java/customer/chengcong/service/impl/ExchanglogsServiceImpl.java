package customer.chengcong.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import customer.chengcong.dao.ExchanggiftsMapper;
import customer.chengcong.dao.ExchanglogsMapper;
import customer.chengcong.dao.MemcardsMapper;
import customer.chengcong.entity.Exchanggifts;
import customer.chengcong.entity.Exchanglogs;
import customer.chengcong.entity.ExchanglogsExample;
import customer.chengcong.entity.ExchanglogsExample.Criteria;
import customer.chengcong.entity.Memcards;
import customer.chengcong.service.IExchanglogsService;

@Service
public class ExchanglogsServiceImpl implements IExchanglogsService{

	@Autowired
	private ExchanglogsMapper exchanglogsMapper;
	
	@Autowired
	private MemcardsMapper memcardsMapper;
	
	@Autowired
	private ExchanggiftsMapper exchanggiftsMapper;

	
	public void addexchangLog(Memcards memcard, String rows) {
		//创建Gson对象
		Gson gson = new Gson();
		
		//将json字符串转换为java对象,并指定类型为List<Exchanglogs>,Exchanglogs中并不全部字段有值,只有json字符串的建值才有值
		List<Exchanglogs> exchanglogslist = gson.fromJson(rows, new TypeToken<List<Exchanglogs>>(){}.getType());
		
		//将json字符串转换为java对象,并指定类型为List<Exchanggifts>,Exchanggifts中并不全部字段有值,只有json字符串的建值才有值
		List<Exchanggifts> exchanggiftslist = gson.fromJson(rows, new TypeToken<List<Exchanggifts>>(){}.getType());
				
		//本次兑换需要的总积分
		int totalPoint = 0;
		for(int i = 0; i < exchanglogslist.size(); i++){
			Exchanggifts gift = exchanggiftslist.get(i);
			Exchanglogs log = exchanglogslist.get(i);
			
			//补全兑换记录
			log.setExchanglogsCreatetime(new Date());
			//将当期兑换礼品的总积分设置为当期礼品的积分乘上当期礼品的兑换数量
			log.setExchanglogsPoint(gift.getExchanggiftsPoint() * log.getExchanglogsNumber());
			log.setMemcardsCardid(memcard.getMemcardsCardid());
			log.setMemcardsId(memcard.getMemcardsId());
			log.setMemcardsName(memcard.getMemcardsName());
			totalPoint += gift.getExchanggiftsPoint() * log.getExchanglogsNumber();
			exchanglogsMapper.insert(log);
			Exchanggifts gift2 = new Exchanggifts();
			gift2.setExchanggiftsId(gift.getExchanggiftsId());
			gift2.setExchanggiftsInteger(gift.getExchanggiftsInteger() - log.getExchanglogsNumber());
			gift2.setExchanggiftsExchangnum(gift.getExchanggiftsExchangnum() + log.getExchanglogsNumber());
			
			exchanggiftsMapper.updateByPrimaryKeySelective(gift2);
		}
		memcard.setMemcardsName(null);
		memcard.setMemcardsCardid(null);
		memcard.setMemcardsPoint(memcard.getMemcardsPoint() - totalPoint);
		memcardsMapper.updateByPrimaryKeySelective(memcard);
		
	}


	
	public List<Exchanglogs> selectAll(String memcardsReferercard) {
		ExchanglogsExample example = new ExchanglogsExample();
		Criteria c = example.createCriteria();
		if(memcardsReferercard !=null && !"".equals(memcardsReferercard)) {
			c.andMemcardsCardidEqualTo(memcardsReferercard);
		}
			return exchanglogsMapper.selectByExample(example);
	}
	
}
