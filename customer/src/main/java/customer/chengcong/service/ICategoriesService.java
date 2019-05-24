package customer.chengcong.service;

import java.util.List;

import customer.chengcong.entity.Categories;

public interface ICategoriesService {

	List<Categories> selectByName(String name);

	
}
