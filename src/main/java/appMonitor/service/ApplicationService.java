package appMonitor.service;

import appMonitor.common.Page;
import appMonitor.domain.AppRegister;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Create By zhangdd happy programming....
 *
 * @Author zhangdd
 * @Date 2019/8/15  21:42
 * @Version 1.0
 */
@Component
public interface ApplicationService {
    /**
     * 应用注册
     * @param  registerMap
     * @return
     */
    public int addApplication(ConcurrentHashMap registerMap);
    
    /**
     * 删除应用
     * @param appId
     * @return
     */
    public int removeApplication(String appId);
    
    /**
     * 更新应用
     * @param appregister
     * @return
     */
    public int updateApplication(AppRegister appregister);
    
    /**
     * 查询应用
     * @param  appRegister
     * @return
     */
    public List<AppRegister> queryApp(AppRegister appRegister);
    
    
    /**
     * 分页查询
     * @param appregister
     * @return
     */
    public List<AppRegister> getPagination(Page<AppRegister> appregister);
    
    /**
     * 获取应用总数
     * @param AppRegister
     * @return
     */
    public int getCount(AppRegister AppRegister);
    
}
