package customer.chengcong.service;

import java.util.List;

import customer.chengcong.entity.Users;

public interface IUsersService {

	public Users login(Users user);

	public void insert(Users user);

	public List<Users> selectAll(Users user);

	public Users selectById(int usersId);

	public void update(Users user);

	public boolean delete(Integer usersId);
}
