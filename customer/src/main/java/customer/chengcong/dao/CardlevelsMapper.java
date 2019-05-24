package customer.chengcong.dao;

import customer.chengcong.entity.Cardlevels;
import customer.chengcong.entity.CardlevelsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardlevelsMapper {
    int countByExample(CardlevelsExample example);

    int deleteByExample(CardlevelsExample example);

    int deleteByPrimaryKey(Integer cardlevelsId);

    int insert(Cardlevels record);

    int insertSelective(Cardlevels record);

    List<Cardlevels> selectByExample(CardlevelsExample example);

    Cardlevels selectByPrimaryKey(Integer cardlevelsId);

    int updateByExampleSelective(@Param("record") Cardlevels record, @Param("example") CardlevelsExample example);

    int updateByExample(@Param("record") Cardlevels record, @Param("example") CardlevelsExample example);

    int updateByPrimaryKeySelective(Cardlevels record);

    int updateByPrimaryKey(Cardlevels record);
}