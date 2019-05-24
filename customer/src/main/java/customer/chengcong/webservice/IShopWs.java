package customer.chengcong.webservice;

import java.util.List;

import javax.jws.WebService;

import customer.chengcong.entity.Shops;
import customer.chengcong.entity.Users;

@WebService
public interface IShopWs {

	public List<Shops> queryAllShopsByNotAssociate();
	public List<Shops> queryAllShopsByAssociate(int decidedzoneId);
	public void updateShopsDecidezoneId(int decidedzoneId,List<Integer> shopIds);
	public Users queryByPhone(String phone);
	
}
