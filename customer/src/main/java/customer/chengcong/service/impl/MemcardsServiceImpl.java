package customer.chengcong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.chengcong.dao.MemcardsMapper;
import customer.chengcong.entity.Memcards;
import customer.chengcong.entity.MemcardsExample;
import customer.chengcong.entity.MemcardsExample.Criteria;
import customer.chengcong.service.IMemcardsService;

@Service
public class MemcardsServiceImpl implements IMemcardsService{

	@Autowired
	private MemcardsMapper memcardsMapper;
	
	public List<Memcards> selectAll(Memcards memcard) {
		MemcardsExample example = new MemcardsExample();
		Criteria c = example.createCriteria();
		if(memcard != null) {
			if(memcard.getMemcardsCardid() !=null && !"".equals(memcard.getMemcardsCardid())) {
				c.andMemcardsCardidLike("%"+memcard.getMemcardsCardid()+"%");
			}
			if(memcard.getMemcardsName() !=null && !"".equals(memcard.getMemcardsName())) {
				c.andMemcardsNameLike("%"+memcard.getMemcardsName()+"%");
			}
			if(memcard.getMemcardsMobile() !=null && !"".equals(memcard.getMemcardsMobile())) {
				c.andMemcardsMobileLike("%"+memcard.getMemcardsMobile()+"%");
			}
			if(memcard.getCardlevelsId() !=null && !"".equals(memcard.getCardlevelsId())) {
				c.andCardlevelsIdEqualTo(memcard.getCardlevelsId());
			}
			if(memcard.getMemcardsState() !=null && !"".equals(memcard.getMemcardsState())) {
				c.andMemcardsStateEqualTo(memcard.getMemcardsState());
			}
		}
		return memcardsMapper.selectByExample(example);
	}

	
	public Memcards selectByCardid(String memcardsReferercard) {
		MemcardsExample example = new MemcardsExample();
		example.or().andMemcardsCardidEqualTo(memcardsReferercard);
		example.or().andMemcardsMobileEqualTo(memcardsReferercard);
		List<Memcards> memcards = memcardsMapper.selectByExample(example);
		if(memcards.size() !=0){
			return memcards.get(0);
		}
		return null;
	}


	
	public void insert(Memcards memcard) {
		memcardsMapper.insert(memcard);
		
	}


	
	public Memcards selectById(int memcardsId) {
		MemcardsExample example = new MemcardsExample();
		example.createCriteria().andMemcardsIdEqualTo(memcardsId);
		return memcardsMapper.selectByPrimaryKey(memcardsId);
	}


	
	public boolean delete(Integer memcardsId) {
		int count=memcardsMapper.deleteByPrimaryKey(memcardsId);
		return count>0?true:false;
	}


	
	public void update(Memcards memcard) {
		memcardsMapper.updateByPrimaryKeySelective(memcard);
		
	}


	
	public void importExcel(List<Memcards> memcardsList) {
		for(Memcards m: memcardsList){
			memcardsMapper.insert(m);
		}
		
	}
}
