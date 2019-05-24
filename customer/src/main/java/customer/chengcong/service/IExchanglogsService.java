package customer.chengcong.service;

import java.util.List;

import customer.chengcong.entity.Exchanglogs;
import customer.chengcong.entity.Memcards;

public interface IExchanglogsService {

	void addexchangLog(Memcards memcard, String rows);

	List<Exchanglogs> selectAll(String memcardsReferercard);

}
