package appMonitor.shiro.domain;


import java.io.Serializable;

public class Permission implements Serializable {

    private static final long serialVersionUID = -5440372534300871944L;

    // 权限id
    public Integer pid;

    // 操作权限
    private String permission;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

}
