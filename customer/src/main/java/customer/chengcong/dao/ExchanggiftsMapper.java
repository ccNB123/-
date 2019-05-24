package customer.chengcong.dao;

import customer.chengcong.entity.Exchanggifts;
import customer.chengcong.entity.ExchanggiftsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExchanggiftsMapper {
    int countByExample(ExchanggiftsExample example);

    int deleteByExample(ExchanggiftsExample example);

    int deleteByPrimaryKey(Integer exchanggiftsId);

    int insert(Exchanggifts record);

    int insertSelective(Exchanggifts record);

    List<Exchanggifts> selectByExample(ExchanggiftsExample example);

    Exchanggifts selectByPrimaryKey(Integer exchanggiftsId);

    int updateByExampleSelective(@Param("record") Exchanggifts record, @Param("example") ExchanggiftsExample example);

    int updateByExample(@Param("record") Exchanggifts record, @Param("example") ExchanggiftsExample example);

    int updateByPrimaryKeySelective(Exchanggifts record);

    int updateByPrimaryKey(Exchanggifts record);
}