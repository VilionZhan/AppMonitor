package appMonitor.mapper;

import appMonitor.domain.AppUser;
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
public interface AppUserMapper {
    @Transactional
    int deleteByPrimaryKey(Integer userPhone);
    @Transactional
    int insert(AppUser record);
    @Transactional
    int insertOrUpdate(AppUser record);
    @Transactional
    int insertOrUpdateSelective(AppUser record);
    @Transactional
    int insertSelective(AppUser record);

    AppUser selectByPrimaryKey(Integer userPhone);
    @Transactional
    int updateByPrimaryKeySelective(AppUser record);
    @Transactional
    int updateByPrimaryKey(AppUser record);
    @Transactional
    int updateBatch(List<AppUser> list);
    @Transactional
    int batchInsert(@Param("list") List<AppUser> list);
}