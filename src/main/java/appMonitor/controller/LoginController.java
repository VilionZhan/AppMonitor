package appMonitor.controller;

import appMonitor.common.AjaxResult;
import appMonitor.service.LoginService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录Controller
 * @author ZBD
 */
@Controller
public class LoginController {
	private  final Log log = LogFactory.getLog(LoginController.class);

	@Autowired
	private LoginService loginService;


	/**
	 * 登陆
	 */
	@RequestMapping("/login")
	public  AjaxResult   login(HttpServletRequest request, HttpServletResponse response){
		return  loginService.login(request,response);
//		return "login";
	}
	/**
	 * 检验前台数据
	 * @return
	 */
	@RequestMapping("/checkdate")
	@ResponseBody
	public Map retAjaxDate() {
		Map map =new HashMap();
		map.put("retcode","1");
		return map;
	}
	/**
	 * 进入系统主页
	 */
	@RequestMapping("/main")
	public String loginSystem(){
		return "app/main";
	}

	@RequestMapping("/logout")
	public AjaxResult logout(){

	}
}
