package appMonitor.service;

import appMonitor.common.AjaxResult;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Create By zhangdd happy programming....
 *
 * @Author zhangdd
 * @Date 2019/8/17  13:34
 * @Version 1.0
 */
@Component
public interface LoginService {
    public AjaxResult login(HttpServletRequest request, HttpServletResponse response);
    public AjaxResult logout(HttpServletResponse response, HttpServletRequest request);
}
