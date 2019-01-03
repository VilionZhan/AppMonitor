package appMonitor.shiro.domain;

import java.io.Serializable;

/**
 * 用户实体类
 */

public class User implements Serializable {

    private static final long serialVersionUID = -5440372534300871944L;

    // 用户id
    private Integer uid;

    // 用户名
    private String username;

    // 密码
    private String password;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
