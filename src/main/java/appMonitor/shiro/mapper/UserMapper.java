package appMonitor.shiro.mapper;

import appMonitor.shiro.domain.AppUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    AppUser findByUserName(String username);
}
