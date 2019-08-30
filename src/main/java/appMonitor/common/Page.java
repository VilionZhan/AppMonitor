/**
 * Copyright © 2015-2016 北京银港科技有限公司. All rights reserved.
 */
package appMonitor.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create By zhangdd happy programming....
 *
 * @Author zhangdd
 * @Date 2019/8/15  21:42
 * @Version 1.0
 * @description 分页类
 */
public class Page<T> {
	private static Logger logger = LoggerFactory.getLogger(Page.class);

	// 查询条件Model
	T condition;
	// 每页显示行数
	public static final int PAGE_SHOW_COUNT = 15;
	// 当前页数
	private int pageNum;
	// 每页显示数量
	private int numPerPage;
	// 总行数
	private int totalCount;
	// 开始行数
	private int startRow;
	// 结束行数
	private int endRow;

	public T getCondition() {
		return condition;
	}

	public void setCondition(T condition) {
		this.condition = condition;
	}

	public int getPageNum() {
		return pageNum > 0 ? pageNum : 1;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getNumPerPage() {
		return numPerPage > 0 ? numPerPage : PAGE_SHOW_COUNT;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	// 适用于Oracle
	public int getStartRow() {
		int rowNum = (getPageNum() - 1) * getNumPerPage() + 1;
		return rowNum;
	}

	// 适用于Oracle
	public int getEndRow() {
		int rowNum = getPageNum() * getNumPerPage();
		return rowNum;
	}

	/*
	 * public Page(){}
	 * 
	 * // 设置总数量的同时，设置总页数 public Page(int pageNum,int numPerPage){ this.pageNum =
	 * pageNum; this.numPerPage = numPerPage; }
	 */

	@Override
	public String toString() {
		return "Page [condition=" + condition + ", pageNum=" + pageNum + ", numPerPage=" + numPerPage + ", totalCount="
				+ totalCount + ", startRow=" + startRow + "]";
	}

}
