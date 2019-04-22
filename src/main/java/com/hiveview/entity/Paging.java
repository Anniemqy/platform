package com.hiveview.entity;

public class Paging {

	private Object param;
	/**
	 * 页码 ,当前页
	 */
	private int currentPage = 1;
	/**
	 * 每页记录条数
	 */
	private int pageSize = 10;
	/**
	 * 记录总条数
	 */
	private long totalCount = -1;
	/**
	 * 记录总页数
	 */
	private int totalPages;
	/**
	 * 跳过查询的行数
	 */
	private int skipNo;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
		skipNo = (this.currentPage - 1) * pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
		if (this.totalCount % pageSize == 0)
			totalPages = (int) (this.totalCount / pageSize);
		else
			totalPages = (int) (this.totalCount / pageSize + 1);
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getSkipNo() {
		return skipNo;
	}

	public Object getParam() {
		return param;
	}

	public void setParam(Object param) {
		this.param = param;
	}
}
