package com.icss.vo;

public class Page {

	private Integer pageNum;     //当前第几页
	private Integer curr;		//每页几条数据
	private Integer dateSize;	//数据总条数
	private Integer PageTotal;   //总页数
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getCurr() {
		return curr;
	}
	public void setCurr(Integer curr) {
		this.curr = curr;
	}
	
	public Integer getDateSize() {
		return dateSize;
	}
	public void setDateSize(Integer dateSize) {
		this.dateSize = dateSize;
	}
	public Integer getPageTotal() {
		return PageTotal;
	}
	public void setPageTotal(Integer pageTotal) {
		PageTotal = pageTotal;
	}
	
}
