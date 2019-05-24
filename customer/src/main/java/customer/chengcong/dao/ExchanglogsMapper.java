package customer.chengcong.dao;

import customer.chengcong.entity.Exchanglogs;
import customer.chengcong.entity.ExchanglogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExchanglogsMapper {
    int countByExample(ExchanglogsExample example);

    int deleteByExample(ExchanglogsExample example);

    int deleteByPrimaryKey(Integer exchanglogsId);

    int insert(Exchanglogs record);

    int insertSelective(Exchanglogs record);

    List<Exchanglogs> selectByExample(ExchanglogsExample example);

    Exchanglogs selectByPrimaryKey(Integer exchanglogsId);

    int updateByExampleSelective(@Param("record") Exchanglogs record, @Param("example") ExchanglogsExample example);

    int updateByExample(@Param("record") Exchanglogs record, @Param("example") ExchanglogsExample example);

    int updateByPrimaryKeySelective(Exchanglogs record);

    int updateByPrimaryKey(Exchanglogs record);
}