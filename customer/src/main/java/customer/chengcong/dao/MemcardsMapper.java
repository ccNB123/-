package customer.chengcong.dao;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import customer.chengcong.entity.Memcards;
import customer.chengcong.entity.MemcardsExample;

public interface MemcardsMapper {
    int countByExample(MemcardsExample example);

    int deleteByExample(MemcardsExample example);

    int deleteByPrimaryKey(Integer memcardsId);

    int insert(Memcards record);

    int insertSelective(Memcards record);

    List<Memcards> selectByExample(MemcardsExample example);

    Memcards selectByPrimaryKey(Integer memcardsId);

    int updateByExampleSelective(@Param("record") Memcards record, @Param("example") MemcardsExample example);

    int updateByExample(@Param("record") Memcards record, @Param("example") MemcardsExample example);

    int updateByPrimaryKeySelective(Memcards record);

    int updateByPrimaryKey(Memcards record);
}