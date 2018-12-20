package appMonitor.service;

import appMonitor.Utils.AppUtil;
import appMonitor.common.AjaxResult;
import appMonitor.common.Constant;
import appMonitor.entity.ParamData;
import appMonitor.implement.ApplicationDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Service
public class LoginService {
    @Autowired
    private ApplicationDaoImp applicationDaoImp;

    public AjaxResult login(HttpServletRequest request, HttpServletResponse response){
        String verifyCode = (String) request.getSession().getAttribute(Constant.VERIFY_CODE);
        String result =null;
        ParamData params = new ParamData();
        String vcode = params.getString("vcode");
        if (params.containsKey("vcode") && (StringUtils.isEmpty(verifyCode) || !verifyCode.equalsIgnoreCase(vcode))) {
            result = "验证码错误";
        }else{
            String username = params.getString("username");
            String loginIp = params.getString("loginIp");
            String key = username + loginIp + Constant.LOGIN_ERROR_TIMES;
            String user =username;////通过username查询数据库获取用户信息，未完成后续开发
            if (user == null || "".equals(params.getString("password"))) {
                result = "用户名或密码错误";
            }else{
                result = "系统异常";
            }
        }
        return AppUtil.returnObj(result);
    }
}
