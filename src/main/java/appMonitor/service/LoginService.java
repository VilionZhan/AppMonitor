package appMonitor.service;

import appMonitor.dao.ApplicationDaoImp;
import appMonitor.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@Service
public class LoginService {
    @Autowired
    private   ApplicationDaoImp applicationDaoImp;

    public String login(HttpServletRequest request, HttpServletResponse response){
        List list = new ArrayList();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        Application appInfo = new Application();
//        if (name != null || !"".equals(name) && password != null || !"".equals(password)){
////            appInfo.setUserName(name);
////            appInfo.setPassword(password);
//            list = applicationDaoImp.selectUserInfo(appInfo);
//        }
        return list.toString();
    }
}
