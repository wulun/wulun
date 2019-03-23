package com.icss.vo;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class Bill {
	private Integer bid;
	private String billname;
	private Integer price;
	private Integer num;
	private Integer proid;
	private Integer money;
	private String status;
	private Date createtime;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBillname() {
		return billname;
	}
	public void setBillname(String billname) {

		this.billname = billname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getProid() {
		return proid;
	}
	public void setProid(Integer proid) {
		this.proid = proid;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Bill [bid=" + bid + ", billname=" + billname + ", price=" + price + ", num=" + num + ", proid=" + proid + ", money=" + money
				+ ", status=" + status + ", createtime=" + createtime + "]";
	}
	
}

