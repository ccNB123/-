package customer.chengcong.service;

import java.util.List;

import customer.chengcong.entity.Exchanggifts;

public interface IExchanggiftsService {

	List<Exchanggifts> selectAll(Exchanggifts gift);

	void insert(Exchanggifts gift);

	Exchanggifts selectById(int exchanggiftsId);

	void update(Exchanggifts gift);

	boolean delete(Integer exchanggiftsId);

	

}
