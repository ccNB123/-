package customer.chengcong.service;

import java.util.List;

import customer.chengcong.entity.Shops;

public interface IShopsService {

	List<Shops> selectAll(Shops shop);

	void insert(Shops shop);

	Shops selectById(int shopId);

	void update(Shops shop);

	boolean delete(int shopId);

}
