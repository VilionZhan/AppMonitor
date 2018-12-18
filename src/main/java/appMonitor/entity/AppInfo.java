package appMonitor.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="AppInfo")
public class AppInfo {
	/**
	 * 主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	//应用
	private String ip;

	//应用端口
	private String port;

	//用户名称

	private  String userName;
	//密码

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private  String password;



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	private String applicationName;


	@Override
	public String toString() {
		return "AppInfo{" +
				"id=" + id +
				", ip='" + ip + '\'' +
				", port='" + port + '\'' +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", applicationName='" + applicationName + '\'' +
				'}';
	}
}

