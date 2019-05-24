package customer.chengcong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.chengcong.dao.ExchanggiftsMapper;
import customer.chengcong.entity.Exchanggifts;
import customer.chengcong.entity.ExchanggiftsExample;
import customer.chengcong.service.IExchanggiftsService;

@Service
public class ExchanggiftsServiceImpl implements IExchanggiftsService{

	@Autowired
	private ExchanggiftsMapper exchanggiftsMapper;

	@Override
	public List<Exchanggifts> selectAll(Exchanggifts gift) {
		ExchanggiftsExample example = new ExchanggiftsExample();
		
		
		return exchanggiftsMapper.selectByExample(example);
	}

	@Override
	public void insert(Exchanggifts gift) {
		exchanggiftsMapper.insert(gift);
		
	}

	@Override
	public Exchanggifts selectById(int exchanggiftsId) {
		ExchanggiftsExample example = new ExchanggiftsExample();
		example.createCriteria().andExchanggiftsIdEqualTo(exchanggiftsId);
		return exchanggiftsMapper.selectByPrimaryKey(exchanggiftsId);
	}

	@Override
	public void update(Exchanggifts gift) {
		exchanggiftsMapper.updateByPrimaryKeySelective(gift);
		
	}

	@Override
	public boolean delete(Integer exchanggiftsId) {
		int count=exchanggiftsMapper.deleteByPrimaryKey(exchanggiftsId);
		return count>0?true:false;
	}
	
	
}
