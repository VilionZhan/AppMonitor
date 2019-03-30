package appMonitor.shiro.mapper;

import appMonitor.shiro.domain.Role;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Role record);

    int insertOrUpdate(Role record);

    int insertOrUpdateSelective(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    int updateBatch(List<Role> list);

    int batchInsert(@Param("list") List<Role> list);
}