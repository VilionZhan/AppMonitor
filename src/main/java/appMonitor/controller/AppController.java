package appMonitor.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        log.info("===appInstallpage is begin===");
        //若部署成功返回消息
        log.info("===appInstallpage is ok===");
        return "app/appInstallpage";
    }

    //返回系统首页
    @RequestMapping(value = "/content",method = RequestMethod.POST)
    public String content(){
        System.out.println("content..........................");
        return "common/content";
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
