package appMonitor.shiro.mapper;

import appMonitor.shiro.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findByUserName(String username);
}
