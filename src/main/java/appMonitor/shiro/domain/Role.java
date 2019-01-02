package appMonitor.shiro.domain;

import java.io.Serializable;

/**
 * 角色实体类
 */

public class Role implements Serializable {

    private static final long serialVersionUID = -5440372534300871944L;

    // 角色id
    private Integer rid;

    // 角色名称
    private String roleName;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


}
