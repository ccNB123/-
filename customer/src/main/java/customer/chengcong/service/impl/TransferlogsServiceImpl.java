package customer.chengcong.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.chengcong.dao.MemcardsMapper;
import customer.chengcong.dao.TransferlogsMapper;
import customer.chengcong.entity.Memcards;
import customer.chengcong.entity.Transferlogs;
import customer.chengcong.service.ITransferlogsService;

@Service
public class TransferlogsServiceImpl implements ITransferlogsService{

	@Autowired
	private TransferlogsMapper transferlogsMapper;
	
	@Autowired
	private MemcardsMapper memcardsMapper;

	
	public void add(Transferlogs transferlog) {
		transferlog.setTransferlogsCreatetime(new Date());
		transferlogsMapper.insert(transferlog);
		
		Memcards from = memcardsMapper.selectByPrimaryKey(transferlog.getTransferlogsFrommcId());
		Memcards to = memcardsMapper.selectByPrimaryKey(transferlog.getTransferlogsTomcId());
		
		from.setMemcardsMoney(from.getMemcardsMoney() == null?0:from.getMemcardsMoney() - transferlog.getTransferlogsTransfermoney());
		to.setMemcardsMoney(to.getMemcardsMoney() == null?0+transferlog.getTransferlogsTransfermoney():to.getMemcardsMoney() + transferlog.getTransferlogsTransfermoney());
		
		memcardsMapper.updateByPrimaryKey(from);
		memcardsMapper.updateByPrimaryKey(to);
	}
}
