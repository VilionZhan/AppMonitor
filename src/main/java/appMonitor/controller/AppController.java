package appMonitor.controller;

import appMonitor.common.BaseController;
import appMonitor.domain.AppRegister;
import appMonitor.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Controller
@RequestMapping("main")
public class AppController  extends BaseController {
    /**
     * 应用部署
     * @author zhangbendong
     * @date   2018年9月11日 上午10:50:34
     * @param httpservelt
     * @return html
     */
    
    @Autowired
    ApplicationService applicationService;
    
    @Autowired
    AppRegister appRegisters;
    
    // 注册页面
    @RequestMapping(value = "/ApplicationAddPage",method = RequestMethod.POST)
    public String ApplicationAddPage(){
        return "app/appInstallpage";
    }

    
    // 注册服务
    @RequestMapping(value = "/AddApplication",method = RequestMethod.POST)
    @ResponseBody
    public String AddApplication(@RequestBody ConcurrentHashMap registerMap){
        String retMes = "";
        int result = applicationService.addApplication(registerMap);
        if (result == 1){
            retMes = "注册成功!";
        }else{
            retMes = "注册失败,IP地址重复!";
        }
        return "";
//        return ajaxDoneSuccess(retMes);
    }

    
    
    //服务查询页面
    @RequestMapping(value = "/ApplicationQueryPage",method = RequestMethod.POST)
    public String ApplicationQueryPage(Model model){
        return "app/appInstallsearch";
    }

    
    //服务查询
    @RequestMapping(value = "/QueryApplication",method = RequestMethod.POST)
    public String QueryApplication(@RequestBody  AppRegister appRegister,Model model){
        
        appRegisters = appRegister;
        
        List<AppRegister> appregister = applicationService.queryApp(appRegisters);
        
        model.addAttribute("appregister",appregister);
        
        model.addAttribute("title", "应用列表");
        
        return "app/appInstallsearch :: appregisters";
        
    }
    
    //ecahrt
    @RequestMapping("/echart")
    public String goEchart(Model model){
        return "common/echart";
    }
    
    
    //System
    @RequestMapping("/System")
    public String System(Model model){
        return "common/System";
    }

}
