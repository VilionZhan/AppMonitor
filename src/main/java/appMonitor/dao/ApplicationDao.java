package appMonitor.dao;

import appMonitor.entity.AppInfo;

import java.util.List;

public interface ApplicationDao {
    //新增应用
    public int insert(AppInfo appInfo);

    //删除应用
    public  int deleteAppByip(AppInfo appInfo);

    //修改应用信息
    public int updateApplication(AppInfo appInfo);

    //查询应用
    public List  selectApplicationByip(AppInfo appInfo);

    //查询端口是否存在
    public int selectApplicationByport(AppInfo appInfo);

    //查询已注册应用
    public List selectApplication(AppInfo appInfo);

    //用户登陆
    public List selectUserInfo(AppInfo appInfo);
}
