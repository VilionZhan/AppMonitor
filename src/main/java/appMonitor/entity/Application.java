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
	private String applicationip;

	//应用端口
	private String applicationport;

	//应用名称
	private String applicationname;

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

	public String getApplicationip() {
		return applicationip;
	}

	public void setApplicationip(String applicationip) {
		this.applicationip = applicationip;
	}

	public String getApplicationport() {
		return applicationport;
	}

	public void setApplicationport(String applicationport) {
		this.applicationport = applicationport;
	}

	public String getApplicationname() {
		return applicationname;
	}

	public void setApplicationname(String applicationname) {
		this.applicationname = applicationname;
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
		return "Application{" + "id=" + id + ", applicationip='" + applicationip + '\'' + ", applicationport='" + applicationport + '\'' + ", applicationname='" + applicationname + '\'' + ", createDate='" + createDate + '\'' + ", createAuthor='" + createAuthor + '\'' + '}';
	}
}

