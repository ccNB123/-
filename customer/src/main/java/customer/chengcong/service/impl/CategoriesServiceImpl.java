package customer.chengcong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.chengcong.dao.CategoriesMapper;
import customer.chengcong.entity.Categories;
import customer.chengcong.entity.CategoriesExample;
import customer.chengcong.service.ICategoriesService;

@Service
public class CategoriesServiceImpl implements ICategoriesService{
	
	@Autowired
	private CategoriesMapper categoriesMapper;

	
	public List<Categories> selectByName(String name) {
		CategoriesExample example = new CategoriesExample();
		example.createCriteria().andCategoryNameEqualTo(name).andCategoryPidIsNotNull();
		return categoriesMapper.selectByExample(example);
	}

}
