package appMonitor.controller;

import appMonitor.domain.AppRegister;
import appMonitor.service.ApplicationService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

@Controller
@RequestMapping("main")
public class AppController {
    /**
     * 应用部署
     * @author zhangbendong
     * @date   2018年9月11日 上午10:50:34
     * @param httpservelt
     * @return html
     */
    private  final Log log = LogFactory.getLog(AppController.class);

    @Autowired
    ApplicationService applicationService;

    //注册注册页面
    @RequestMapping(value = "/ApplicationAddPage",method = RequestMethod.POST)
    public String ApplicationAddPage(){
        
        return "app/appInstallpage";
        
    }

    // 注册服务
    @RequestMapping(value = "/AddApplication",method = RequestMethod.POST)
    @ResponseBody
    public String AddApplication(@RequestBody ConcurrentHashMap registerMap){
    
        String searchRsult = "false";
    
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
        
        String result = applicationService.CreateApplication(application);
       
        return result;
    }



    //服务查询页面
    @RequestMapping(value = "/ApplicationQueryPage",method = RequestMethod.POST)
    public String ApplicationQueryPage(){
        
        return "app/appInstallsearch";
        
    }

    //服务查询:通过注册IP地址查询
    @RequestMapping(value = "/QueryApplication",method = RequestMethod.POST)
    @ResponseBody
    public String QueryApplication(@RequestBody ConcurrentHashMap map){
    
        String searchRsult = "false";
    
        String applicationIp = String.valueOf(map.get("applicationIp"));
        
        log.info("IP地址["+applicationIp+"]");
        
        AppRegister application = new AppRegister();
        
        application.setAppAddress(applicationIp);
        
        boolean result = applicationService.QueryApplication(application);
        
        if (!result){
            
            searchRsult = "true";
            
        }
        
        return searchRsult;
    }

    //返回系统首页
    @RequestMapping(value = "/main",method = RequestMethod.POST)
    public String echart(){
        return "common/echart";
    }

    //返回系统信息
    @RequestMapping(value = "/System",method = RequestMethod.POST)
    public String System(){
        return "common/System";
    }


}
