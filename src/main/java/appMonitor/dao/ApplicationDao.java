package appMonitor.dao;

import appMonitor.entity.Application;
import java.util.List;

public interface ApplicationDao {
    //新增应用;
    public int insert(Application Application);

    //删除应用
    public  int deleteAppByip(Application Application);

    //修改应用信息
    public int updateApplication(Application Application);

    //查询应用
    public List  selectApplicationByip(Application Application);

    //查询端口是否存在
    public int selectApplicationByport(Application Application);

    //查询已注册应用
    public List selectApplication(Application Application);

    //用户登陆
    public List selectUserInfo(Application Application);
}
