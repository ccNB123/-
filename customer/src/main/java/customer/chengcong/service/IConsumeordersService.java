package customer.chengcong.service;

import java.util.List;

import customer.chengcong.entity.Consumeorders;

public interface IConsumeordersService {

	void updatePoint(Consumeorders con, int memcardsId);

	void updateConsume(Consumeorders con, int memcardsId);

	void updateminusPoint(Consumeorders con, int memcardsId);

	List<Consumeorders> selectAll(String memcardsCardid);

}
