package appMonitor.controller;


import appMonitor.Utils.RebootApp;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RebootAppsController {
	private static final Log logger = LogFactory.getLog(RebootAppsController.class);
	@Autowired
	RebootApp rebootApp;
	@RequestMapping(value = "/actuator/rebootapp",method=RequestMethod.POST)
	public String rebootApp(@RequestParam("appName") String appName,@RequestParam("reboot") String reboot){
		String installResult = "";
		if (appName != null && !"".equals(appName)) {
			if ("start".equals(reboot)) {
				logger.info(appName+"启动中......");
				String excUrl = "javaw -jar D:\\test\\com.Register.app1.jar";
				rebootApp.runboot(excUrl);
				logger.info(appName+"启动成功！");
				installResult = "secucess";
			}else{
				installResult = "fail";
			}
		}
		//跳转secucess页面
		return installResult;
	}
}
