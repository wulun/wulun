package com.icss.vo;

public class Page {

	private Integer pageNum;     //��ǰ�ڼ�ҳ
	private Integer curr;		//ÿҳ��������
	private Integer dateSize;	//����������
	private Integer PageTotal;   //��ҳ��
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
