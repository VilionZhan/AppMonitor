package appMonitor.controller;

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
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录Controller
 * @author zhangbendong
 */
@Controller
public class LoginController {

	private  final Log log = LogFactory.getLog(LoginController.class);

	@Autowired
	private LoginService loginService;

	/**
	 * 登录页面 login.html
	 */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 登录认证 shiro
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
            return ResultDomain.error(e.getMessage());
        }
    }

    /**
     * 进入系统主页
     * @param Model model
     * @return url
     */
    @RequestMapping("/main")
    public String loginSystem(Model model){
        //登录成后，即可通过Subject获取登录的用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        //给返回页面封装对象数据
        model.addAttribute("user", user);
        return "app/main";
    }

    /**
     * 用户退出
     * @param request
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        SecurityUtils.getSubject().logout();
        //跳转到/login
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/login";
    }

}
