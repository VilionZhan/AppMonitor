package appMonitor.mapper;

import appMonitor.domain.AppRegister;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
  *Create By zhangdongdong..........
  *@author zhangdongdong
  *@date 2019/3/3023:22
  */
@Mapper
public interface AppRegisterMapper {
    int deleteByPrimaryKey(String appAddress);

    int insert(AppRegister record);

    int insertOrUpdate(AppRegister record);

    int insertOrUpdateSelective(AppRegister record);

    int insertSelective(AppRegister record);

    AppRegister selectByPrimaryKey(String appAddress);

    int updateByPrimaryKeySelective(AppRegister record);

    int updateByPrimaryKey(AppRegister record);

    int updateBatch(List<AppRegister> list);

    int batchInsert(@Param("list") List<AppRegister> list);
}