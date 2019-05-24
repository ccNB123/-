package customer.chengcong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.chengcong.dao.UsersMapper;
import customer.chengcong.entity.Users;
import customer.chengcong.entity.UsersExample;
import customer.chengcong.entity.UsersExample.Criteria;
import customer.chengcong.service.IUsersService;

@Service
public class UsersServiceImpl implements IUsersService{

	@Autowired
	private UsersMapper usersMapper;
	
	public Users login(Users user) {
		UsersExample example=new UsersExample();
		example.createCriteria().andUsersLoginnameEqualTo(user.getUsersLoginname()).andUsersPasswordEqualTo(user.getUsersPassword());
		List<Users> list=usersMapper.selectByExample(example);
		if(list !=null && list.size() !=0){
			return list.get(0);
		}
		return null;
	}

	
	public void insert(Users user) {
		usersMapper.insert(user);
	}

	
	public List<Users> selectAll(Users user) {
		UsersExample example = new UsersExample();
		Criteria c = example.createCriteria();
		if(user != null) {
			if(user.getUsersLoginname() !=null && !"".equals(user.getUsersLoginname())) {
				c.andUsersLoginnameLike("%"+user.getUsersLoginname()+"%");
			}
			if(user.getUsersRealname() !=null && !"".equals(user.getUsersRealname())) {
				c.andUsersRealnameLike("%"+user.getUsersRealname()+"%");
			}
			if(user.getUsersTelephone() !=null && !"".equals(user.getUsersTelephone())) {
				c.andUsersTelephoneLike("%"+user.getUsersTelephone()+"%");
			}
		}
		return usersMapper.selectByExample(example);
	}

	
	public Users selectById(int usersId) {
		UsersExample example = new UsersExample();
		example.createCriteria().andShopIdEqualTo(usersId);
		return usersMapper.selectByPrimaryKey(usersId);
	}

	
	public void update(Users user) {
		usersMapper.updateByPrimaryKeySelective(user);
	}

	
	public boolean delete(Integer usersId) {
		int count=usersMapper.deleteByPrimaryKey(usersId);
		return count>0?true:false;
	}

}
