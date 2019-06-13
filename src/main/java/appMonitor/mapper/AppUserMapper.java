package appMonitor.mapper;

import appMonitor.domain.AppUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
  *Create By zhangdongdong..........
  *@author zhangdongdong
  *@date 2019/3/3023:22
  */
@Mapper
public interface AppUserMapper {
    int deleteByPrimaryKey(Integer userPhone);

    int insert(AppUser record);

    int insertOrUpdate(AppUser record);

    int insertOrUpdateSelective(AppUser record);

    int insertSelective(AppUser record);

    AppUser selectByPrimaryKey(Integer userPhone);

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);

    int updateBatch(List<AppUser> list);

    int batchInsert(@Param("list") List<AppUser> list);
}