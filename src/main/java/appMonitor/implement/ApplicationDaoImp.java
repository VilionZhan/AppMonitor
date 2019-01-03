package appMonitor.implement;


import appMonitor.dao.ApplicationDao;
import appMonitor.entity.Application;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ApplicationDaoImp implements ApplicationDao {
    //新增应用
    @Transactional
    public int insert(Application Application){
        return insert(Application);
    }
    //删除应用
    @Transactional
    public  int deleteAppByip(Application Application){
        return deleteAppByip(Application);
    }
    //修改应用信息
    @Transactional
    public int updateApplication(Application Application){
        return updateApplication(Application);
    }
    //查询应用
    public List selectApplicationByip(Application Application){
        return selectApplicationByip(Application);
    }
    //查询端口是否存在
    public int selectApplicationByport(Application Application){
        return selectApplicationByport(Application);
    }
    //查询已注册应用
    public List selectApplication(Application Application){
        return selectApplication(Application);
    }

    //用户登陆
    public List selectUserInfo(Application Application){
        return  selectUserInfo(Application);
    }
}
