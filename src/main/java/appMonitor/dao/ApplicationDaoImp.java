package appMonitor.dao;

import appMonitor.entity.AppInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class ApplicationDaoImp implements ApplicationDao {
    //新增应用
    @Transactional
    public int insert(AppInfo appInfo){
        return insert(appInfo);
    }
    //删除应用
    @Transactional
    public  int deleteAppByip(AppInfo appInfo){
        return deleteAppByip(appInfo);
    }
    //修改应用信息
    @Transactional
    public int updateApplication(AppInfo appInfo){
        return updateApplication(appInfo);
    }
    //查询应用
    public List selectApplicationByip(AppInfo appInfo){
        return selectApplicationByip(appInfo);
    }
    //查询端口是否存在
    public int selectApplicationByport(AppInfo appInfo){
        return selectApplicationByport(appInfo);
    }
    //查询已注册应用
    public List selectApplication(AppInfo appInfo){
        return selectApplication(appInfo);
    }

    //用户登陆
    public List selectUserInfo(AppInfo appInfo){
        return  selectUserInfo(appInfo);
    }
}
