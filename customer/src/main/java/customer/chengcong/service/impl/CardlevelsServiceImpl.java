package customer.chengcong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.chengcong.dao.CardlevelsMapper;
import customer.chengcong.entity.Cardlevels;
import customer.chengcong.entity.CardlevelsExample;
import customer.chengcong.entity.CardlevelsExample.Criteria;
import customer.chengcong.service.ICardlevelsService;

@Service
public class CardlevelsServiceImpl implements ICardlevelsService{
	
	@Autowired
	private CardlevelsMapper cardlevelsMapper;

	
	public List<Cardlevels> selectAll(Cardlevels cardlevels) {
		CardlevelsExample example = new CardlevelsExample();
		Criteria c=example.createCriteria();
		if(cardlevels != null) {
			if(cardlevels.getCardlevelsLevelname() !=null && !"".equals(cardlevels.getCardlevelsLevelname())) {
				c.andCardlevelsLevelnameLike("%"+cardlevels.getCardlevelsLevelname()+"%");
			}
		}
		return cardlevelsMapper.selectByExample(example);
	}


	
	public void insert(Cardlevels cardlevels) {
		cardlevelsMapper.insert(cardlevels);
		
	}


	
	public Cardlevels selectById(int shopId) {
		CardlevelsExample example = new CardlevelsExample();
		example.createCriteria().andCardlevelsIdEqualTo(shopId);
		return cardlevelsMapper.selectByPrimaryKey(shopId);
	}


	
	public void update(Cardlevels cardlevels) {
		cardlevelsMapper.updateByPrimaryKeySelective(cardlevels);
	}



	
	public boolean delete(Integer cardlevelsId) {
		int count=cardlevelsMapper.deleteByPrimaryKey(cardlevelsId);
		return count>0?true:false;
	}



	
	public List<Cardlevels> select() {
		CardlevelsExample example = new CardlevelsExample();
		return cardlevelsMapper.selectByExample(example);
	}

	
}
