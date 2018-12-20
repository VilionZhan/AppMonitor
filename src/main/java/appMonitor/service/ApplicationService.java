package appMonitor.service;

import appMonitor.dao.ApplicationDao;
import appMonitor.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zbd
 */
@Service
public class ApplicationService {

    @Autowired
    private ApplicationDao applicationDao;
    /**
     * 注册应用
     * @param appInfo
     * @return
     */
    public boolean AppInsatalled(Application appInfo){
        boolean result = true;
        List list =  applicationDao.selectApplicationByip(appInfo);
        if (list.size()>0){
            System.out.println("ip已经存在....");
            result = false;
        }
        return result;
    }
}
