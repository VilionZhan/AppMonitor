package appMonitor.controller;

import appMonitor.entity.Application;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    /**
     * 注册服务
     * @param appinfo
     * @return
     */
    @RequestMapping(value = "/installApp",method = RequestMethod.POST)
    @ResponseBody
    public Application installApp(@RequestBody Application appinfo){

        log.info("接收前台注册数据["+appinfo+"]");
        return appinfo;
    }


    //返回系统首页
    @RequestMapping(value = "/content",method = RequestMethod.POST)
    public String content(){
        return "common/content";
    }
    //返回系统首页
   /* @RequestMapping(value = "/echart",method = RequestMethod.POST)
    public String echart(){
        log.info("echart====================================");
        return "common/echart";
    }*/

    //返回系统信息
    @RequestMapping(value = "/System",method = RequestMethod.POST)
    public String System(){
        return "common/System";
    }
    //启动应用
    /*@RequestMapping(value = "/content",method = RequestMethod.POST)
    public boolean content(){
        System.out.println("content..........................");
        return true;
    }
    //应用停止
    @RequestMapping(value = "/content",method = RequestMethod.POST)
    public boolean content(){
        System.out.println("content..........................");
        return true;
    }
    //应用重启
    @RequestMapping(value = "/content",method = RequestMethod.POST)
    public boolean content(){
        System.out.println("content..........................");
        return true;
    }*/

}
