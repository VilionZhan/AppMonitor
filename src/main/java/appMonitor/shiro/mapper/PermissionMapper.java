package appMonitor.shiro.mapper;

import appMonitor.shiro.domain.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Permission record);

    int insertOrUpdate(Permission record);

    int insertOrUpdateSelective(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    int updateBatch(List<Permission> list);

    int batchInsert(@Param("list") List<Permission> list);
}