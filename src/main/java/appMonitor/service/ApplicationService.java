package appMonitor.service;

import appMonitor.domain.AppRegister;
import appMonitor.mapper.AppRegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zbd
 */
@Service
public class ApplicationService {

    @Autowired
    private AppRegisterMapper appRegisterMapper;
    /**
     * 注册应用
     * @param appInfo
     * @return
     */
    public String CreateApplication(AppRegister appInfo){
        String result = "false";
        AppRegister list =  appRegisterMapper.selectByPrimaryKey(appInfo.getAppAddress());
        if (list != null){
            result = "false";//应用已存在
        }else {
            appRegisterMapper.insert(appInfo);
            result = "true";//新增成功
        }
        return result;
    }

    /**
     * 应用查询
     * @param appInfo
     * @return
     */
    public boolean QueryApplication(AppRegister appInfo){
        AppRegister appRegister = appRegisterMapper.selectByPrimaryKey(appInfo.getAppAddress());
        if (appRegister!=null){
            return true;
        }else {
            return false;
        }
    }

}
