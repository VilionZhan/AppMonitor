package appMonitor.mapper;

import appMonitor.domain.AppRegister;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
  *Create By zhangdongdong..........
  *@author zhangdongdong
  *@date 2019/3/3023:22
  */
@Mapper
public interface AppRegisterMapper {
    int deleteByPrimaryKey(String appAddress);
    @Transactional
    int insert(AppRegister record);
    @Transactional
    int insertOrUpdate(AppRegister record);
    @Transactional
    int insertOrUpdateSelective(AppRegister record);
    @Transactional
    int insertSelective(AppRegister record);

    AppRegister selectByPrimaryKey(String appAddress);
    @Transactional
    int updateByPrimaryKeySelective(AppRegister record);
    @Transactional
    int updateByPrimaryKey(AppRegister record);
    @Transactional
    int updateBatch(List<AppRegister> list);
    @Transactional
    int batchInsert(@Param("list") List<AppRegister> list);
    
    List<AppRegister>  queryApplication(AppRegister appRegister);
    
}