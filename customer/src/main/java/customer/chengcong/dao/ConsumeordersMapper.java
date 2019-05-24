package customer.chengcong.dao;

import customer.chengcong.entity.Consumeorders;
import customer.chengcong.entity.ConsumeordersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumeordersMapper {
    int countByExample(ConsumeordersExample example);

    int deleteByExample(ConsumeordersExample example);

    int deleteByPrimaryKey(Integer consumeordersId);

    int insert(Consumeorders record);

    int insertSelective(Consumeorders record);

    List<Consumeorders> selectByExample(ConsumeordersExample example);

    Consumeorders selectByPrimaryKey(Integer consumeordersId);

    int updateByExampleSelective(@Param("record") Consumeorders record, @Param("example") ConsumeordersExample example);

    int updateByExample(@Param("record") Consumeorders record, @Param("example") ConsumeordersExample example);

    int updateByPrimaryKeySelective(Consumeorders record);

    int updateByPrimaryKey(Consumeorders record);
}