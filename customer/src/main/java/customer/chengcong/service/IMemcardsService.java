package customer.chengcong.service;

import java.util.List;

import customer.chengcong.entity.Memcards;

public interface IMemcardsService {

	List<Memcards> selectAll(Memcards memcard);

	Memcards selectByCardid(String memcardsReferercard);

	void insert(Memcards memcard);

	Memcards selectById(int memcardsId);

	boolean delete(Integer memcardsId);

	void update(Memcards memcard);

	void importExcel(List<Memcards> memcardsList);



}
