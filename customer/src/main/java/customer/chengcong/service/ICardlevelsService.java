package customer.chengcong.service;

import java.util.List;

import customer.chengcong.entity.Cardlevels;

public interface ICardlevelsService {

	List<Cardlevels> selectAll(Cardlevels cardlevels);

	void insert(Cardlevels cardlevels);

	Cardlevels selectById(int shopId);

	void update(Cardlevels cardlevels);

	boolean delete(Integer cardlevelsId);

	List<Cardlevels> select();

}
