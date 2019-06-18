package appMonitor.domain;

import java.io.Serializable;

/**
 * Create By zhangdongdong..........
 *
 * @author zhangdongdong
 * @date 2019/3/3023:22
 */
public class AppRegister implements Serializable {
    private String appAddress;

    private String appName;

    private Integer appPort;

    private String appRegdate;

    private Integer appStatus;

    private static final long serialVersionUID = 1L;

    public String getAppAddress() {
        return appAddress;
    }

    public void setAppAddress(String appAddress) {
        this.appAddress = appAddress;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getAppPort() {
        return appPort;
    }

    public void setAppPort(Integer appPort) {
        this.appPort = appPort;
    }

    public String getAppRegdate() {
        return appRegdate;
    }

    public void setAppRegdate(String appRegdate) {
        this.appRegdate = appRegdate;
    }

    public Integer getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(Integer appStatus) {
        this.appStatus = appStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appAddress=").append(appAddress);
        sb.append(", appName=").append(appName);
        sb.append(", appPort=").append(appPort);
        sb.append(", appRegdate=").append(appRegdate);
        sb.append(", appStatus=").append(appStatus);
        sb.append("]");
        return sb.toString();
    }
}