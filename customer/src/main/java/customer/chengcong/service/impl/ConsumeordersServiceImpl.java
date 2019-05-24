package customer.chengcong.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.chengcong.dao.ConsumeordersMapper;
import customer.chengcong.dao.MemcardsMapper;
import customer.chengcong.entity.Consumeorders;
import customer.chengcong.entity.ConsumeordersExample;
import customer.chengcong.entity.ConsumeordersExample.Criteria;
import customer.chengcong.entity.Memcards;
import customer.chengcong.service.IConsumeordersService;

@Service
public class ConsumeordersServiceImpl implements IConsumeordersService{

	@Autowired
	private ConsumeordersMapper consumeordersMapper;
	
	@Autowired
	private MemcardsMapper memcardsMapper;

	
	public void updatePoint(Consumeorders con, int memcardsId) {
		consumeordersMapper.insert(con);
		Memcards mem = memcardsMapper.selectByPrimaryKey(memcardsId);
		mem.setMemcardsPoint(mem.getMemcardsPoint() - con.getConsumeordersGavepoint());
		mem.setMemcardsMoney(mem.getMemcardsMoney() + con.getConsumeordersRecash());
		memcardsMapper.updateByPrimaryKeySelective(mem);
	}


	
	public void updateConsume(Consumeorders con, int memcardsId) {
		consumeordersMapper.insert(con);
		Memcards mem = memcardsMapper.selectByPrimaryKey(memcardsId);
		mem.setMemcardsTotalmoney(mem.getMemcardsTotalmoney() + con.getConsumeordersTotalmoney());
		mem.setMemcardsPoint(mem.getMemcardsPoint() + con.getConsumeordersGavepoint());
		mem.setMemcardsTotalcount(mem.getMemcardsTotalcount() + 1);
		memcardsMapper.updateByPrimaryKeySelective(mem);
	}



	
	public void updateminusPoint(Consumeorders con, int memcardsId) {
		con.setConsumeordersCreatetime(new Date());
		consumeordersMapper.insert(con);
		Memcards mem = memcardsMapper.selectByPrimaryKey(memcardsId);
		mem.setMemcardsPoint(mem.getMemcardsPoint() - con.getConsumeordersGavepoint());
		memcardsMapper.updateByPrimaryKeySelective(mem);
	}



	
	public List<Consumeorders> selectAll(String memcardsCardid) {
		ConsumeordersExample example = new ConsumeordersExample();
		Criteria c = example.createCriteria();
		if(memcardsCardid !=null && !"".equals(memcardsCardid)) {
			c.andMemcardsCardidEqualTo(memcardsCardid);
		}
			return consumeordersMapper.selectByExample(example);
	}
}
