package customer.chengcong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.chengcong.dao.ShopsMapper;
import customer.chengcong.entity.Shops;
import customer.chengcong.entity.ShopsExample;
import customer.chengcong.entity.ShopsExample.Criteria;
import customer.chengcong.service.IShopsService;

@Service
public class ShopsServiceImpl implements IShopsService{
	
	@Autowired
	private ShopsMapper shopMapper;

	
	public List<Shops> selectAll(Shops shop) {
		ShopsExample example = new ShopsExample();
		Criteria c = example.createCriteria();
		if(shop != null) {
			if(shop.getShopName() !=null && !"".equals(shop.getShopName())) {
				c.andShopNameLike("%"+shop.getShopName()+"%");
			}
			if(shop.getShopContactname() !=null && !"".equals(shop.getShopContactname())) {
				c.andShopContactnameLike("%"+shop.getShopContactname()+"%");
			}
			if(shop.getShopAddress() !=null && !"".equals(shop.getShopAddress())) {
				c.andShopAddressLike("%"+shop.getShopAddress()+"%");
			}
		}
		return shopMapper.selectByExample(example);
	}


	
	public void insert(Shops shop) {
		shopMapper.insert(shop);
	}



	
	public Shops selectById(int shopId) {
		ShopsExample example = new ShopsExample();
		example.createCriteria().andShopIdEqualTo(shopId);
		return shopMapper.selectByPrimaryKey(shopId);
	}



	
	public void update(Shops shop) {
		shopMapper.updateByPrimaryKeySelective(shop);	
	}



	
	public boolean delete(int shopId) {
		int count=shopMapper.deleteByPrimaryKey(shopId);
		return count>0?true:false;
	}

}
