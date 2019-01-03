package appMonitor.controller;

import appMonitor.common.AjaxResult;
import appMonitor.service.LoginService;
import appMonitor.shiro.domain.ResultDomain;
import appMonitor.shiro.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	 * 登录页面
	 */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

	/**
	 * 登陆
	 */
	/*@RequestMapping("/login")
	public  AjaxResult   login(HttpServletRequest request, HttpServletResponse response){
//		return  loginService.login(request,response);
		return "login";
	}*/
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
     * 认证登录
     * @param username
     * @param password
     * @return
     */

    @PostMapping("/login")
    @ResponseBody
    public ResultDomain login(String username, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 获取Subject对象
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return ResultDomain.ok();
        } catch (UnknownAccountException e) {
            return ResultDomain.error(e.getMessage());
        } catch (IncorrectCredentialsException e) {
            return ResultDomain.error(e.getMessage());
        } catch (LockedAccountException e) {
            return ResultDomain.error(e.getMessage());
        } catch (AuthenticationException e) {
            return ResultDomain.error("认证失败！");
        }
    }

    /**
     * 进入系统主页
     */
    @RequestMapping("/main")
    public String loginSystem(Model model){
        // 登录成后，即可通过Subject获取登录的用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("user", user);
        return "app/main";
    }

    @RequestMapping("/")
    public String redirectIndex() {
        return "redirect:/main";
    }
	@RequestMapping("/logout")
	public AjaxResult logout(HttpServletRequest request, HttpServletResponse response){
		return loginService.logout(response, request);
	}
}
