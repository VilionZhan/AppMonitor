package appMonitor.controller;

import appMonitor.entity.Application;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    private  final Log log = LogFactory.getLog(AppController.class);
    /**
     * 应用部署
     * @author zhangbendong
     * @date   2018年9月11日 上午10:50:34
     * @param httpservelt
     * @return html
     */
    @RequestMapping(value = "/appInstallpage",method = RequestMethod.POST)
    public String appInstall(){
        return "app/appInstallpage";
    }

    // 注册服务
    @RequestMapping(value = "/installApp",method = RequestMethod.POST)
    @ResponseBody
    public Application installApp(@RequestBody Application appinfo){

        log.info("接收前台注册数据["+appinfo+"]");
        return appinfo;
    }

    //服务查询
    @RequestMapping(value = "/appInstallsearch",method = RequestMethod.POST)
    public String serachinstallApp(){
        return "app/appInstallsearch";
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
