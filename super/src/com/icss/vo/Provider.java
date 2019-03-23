package com.icss.vo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Provider {

	private Integer proid;
	private String providername; // ��Ӧ������
	private String contacts; // ��ϵ��
	private String tel;
	private String fax; // ����
	private Date createtime; // ����ʱ��
	private String proaddress; // ��ϵ��ַ
	private String describe; // ����
	public Integer getProid() {
		return proid;
	}
	public void setProid(Integer proid) {
		this.proid = proid;
	}
	public String getProvidername() {
		return providername;
	}
	public void setProvidername(String providername) {
		this.providername = providername;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getCreatetime() {
		Date date =createtime;
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(date);

	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getProaddress() {
		return proaddress;
	}
	public void setProaddress(String proaddress) {
		this.proaddress = proaddress;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	@Override
	public String toString() {
		return "Provider [proid=" + proid + ", providername=" + providername + ", contacts=" + contacts + ", tel=" + tel
				+ ", fax=" + fax + ", createtime=" + createtime + ", proaddress=" + proaddress + ", describe="
				+ describe + "]";
	}
	

}
