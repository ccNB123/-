package customer.chengcong.dao;

import customer.chengcong.entity.Transferlogs;
import customer.chengcong.entity.TransferlogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferlogsMapper {
    int countByExample(TransferlogsExample example);

    int deleteByExample(TransferlogsExample example);

    int deleteByPrimaryKey(Integer transferlogsId);

    int insert(Transferlogs record);

    int insertSelective(Transferlogs record);

    List<Transferlogs> selectByExample(TransferlogsExample example);

    Transferlogs selectByPrimaryKey(Integer transferlogsId);

    int updateByExampleSelective(@Param("record") Transferlogs record, @Param("example") TransferlogsExample example);

    int updateByExample(@Param("record") Transferlogs record, @Param("example") TransferlogsExample example);

    int updateByPrimaryKeySelective(Transferlogs record);

    int updateByPrimaryKey(Transferlogs record);
}