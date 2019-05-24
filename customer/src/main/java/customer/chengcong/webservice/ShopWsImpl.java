package customer.chengcong.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import customer.chengcong.dao.ShopsMapper;
import customer.chengcong.dao.UsersMapper;
import customer.chengcong.entity.Shops;
import customer.chengcong.entity.ShopsExample;
import customer.chengcong.entity.ShopsExample.Criteria;
import customer.chengcong.entity.Users;
import customer.chengcong.entity.UsersExample;

public class ShopWsImpl implements IShopWs{
	
	@Autowired
	private ShopsMapper shopMapper;
	
	@Autowired
	private UsersMapper userMapper;

	@Override
	public List<Shops> queryAllShopsByNotAssociate() {
		ShopsExample example = new ShopsExample();
		Criteria c1 = example.createCriteria().andShopRemarkIsNull();
		Criteria c2 = example.createCriteria().andShopAddressEqualTo("");
		example.or(c1);
		example.or(c2);
		return shopMapper.selectByExample(example);
	}

	@Override
	public List<Shops> queryAllShopsByAssociate(int decidedzoneId) {
		ShopsExample example = new ShopsExample();
		example.createCriteria().andShopRemarkEqualTo(decidedzoneId+"");
		return shopMapper.selectByExample(example);
	}

	@Override
	public void updateShopsDecidezoneId(int decidedzoneId, List<Integer> shopIds) {
		List<Shops> shopList = queryAllShopsByAssociate(decidedzoneId);
		for(Shops shop : shopList){
			shop.setShopRemark(null);
			shopMapper.updateByPrimaryKey(shop);
		}
		
		if(shopIds != null){
			for(int i = 0; i < shopIds.size(); i++){
				Shops s = new Shops();
				s.setShopId(shopIds.get(i));
				s.setShopRemark(decidedzoneId+"");
				shopMapper.updateByPrimaryKeySelective(s);
			}
		}
	}

	@Override
	public Users queryByPhone(String phone) {
		UsersExample example = new UsersExample();
		example.createCriteria().andUsersTelephoneEqualTo(phone);
		List<Users> list = userMapper.selectByExample(example);
		return list != null && list.size()>0?list.get(0):null;
	}

}
