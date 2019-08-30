package appMonitor.service.Impl;

import appMonitor.common.Page;
import appMonitor.domain.AppRegister;
import appMonitor.mapper.AppRegisterMapper;
import appMonitor.service.ApplicationService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangbendong
 * @date   2018年9月11日 上午10:50:34
 */
@Service
public class ApplicationServiceImpl  implements ApplicationService {
    
    private  final Log log = LogFactory.getLog(ApplicationServiceImpl.class);
    
    @Autowired
    private AppRegisterMapper appRegisterMapper;
    @Autowired
    AppRegister appRegister;
    /**
     * 应用注册
     * @param registerMap
     * @return
     */
    public int addApplication(ConcurrentHashMap registerMap) {
    
        String applicationName = String.valueOf(registerMap.get("applicationName"));
    
        String applicationIp = String.valueOf(registerMap.get("applicationIp"));
    
        String applicationPort = String.valueOf(registerMap.get("applicationPort"));
    
        log.info("接收前台注册数据["+applicationName+";"+applicationIp+";"+applicationPort+"]");
    
        int port = Integer.valueOf(applicationPort);
    
        //注册日期
        Date date = new Date();
    
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
        String now = dateFormat.format(date);//以格式处理date
    
        AppRegister application = new AppRegister();
        
        application.setAppName(applicationName);
    
        application.setAppAddress(applicationIp);
    
        application.setAppPort(port);
    
        application.setAppRegdate(now);
    
        application.setAppStatus(0);
       
        AppRegister querylist =  appRegisterMapper.selectByPrimaryKey(applicationIp);
        
        if (querylist != null) {
           
            return 0;//失败返回0
            
        }else {
            
            appRegisterMapper.insert(application);
            
            return 1;//成功返回1
        }
    }
    
    /**
     * 删除应用
     *
     * @param appId
     * @return
     */
    public int removeApplication(String appId) {
        return 0;
    }
    
    /**
     * 更新应用
     *
     * @param appregister
     * @return
     */
    public int updateApplication(AppRegister appregister) {
        return 0;
    }
    
    /**
     * 查询应用
     * @param appRegister
     * @return
     */
    public List<AppRegister> queryApp(AppRegister appRegister) {
        
        appRegister = appRegister;
        
        List<AppRegister>  appregisterlist  =appRegisterMapper.queryApplication(appRegister);
        
        return appregisterlist;
    }
    
    
    /**
     * 分页查询
     *
     * @param appregister
     * @return
     */
    public List<AppRegister> getPagination(Page<AppRegister> appregister) {
        return null;
    }
    
    /**
     * 获取应用总数
     *
     * @param AppRegister
     * @return
     */
    public int getCount(AppRegister AppRegister) {
        return 0;
    }
    
    
    
}
