package appMonitor.controller;

import appMonitor.Utils.HttpTogetAppInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAppInfoController {
    private  Log logger = LogFactory.getLog(GetAppInfoController.class);
    @Autowired
    HttpTogetAppInfo httpTogetAppInfo;
    

    /*@RequestMapping(value = "/getAppInfo/{info}")
    public String getAppInfo(@PathVariable Application info){
           logger.info(info);
            //查询数据库获取注册的服务的IP和端口
           List<Application> regist = applicationDaoImp.selectApplicationByip(info);
           if (regist.size()>0){
               return "App IP IS EXISTER";
           } else {
               return  httpTogetAppInfo.getAppInfo("http://127.0.0.1:8325/actuator/"+info);
           }


    }*/

}

