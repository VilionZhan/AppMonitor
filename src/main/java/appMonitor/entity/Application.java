package appMonitor.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="APPLICATION")
public class Application {
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

	//应用名称
	private String appname;

	//创建时间
	private String createDate;

	//创建人
	private String createAuthor;
	//用户名称


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

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateAuthor() {
		return createAuthor;
	}

	public void setCreateAuthor(String createAuthor) {
		this.createAuthor = createAuthor;
	}

	@Override
	public String toString() {
		return "AppInfo{" + "id=" + id + ", ip='" + ip + '\'' + ", port='" + port + '\'' + ", appname='" + appname + '\'' + ", createDate='" + createDate + '\'' + ", createAuthor='" + createAuthor + '\'' + '}';
	}
}

