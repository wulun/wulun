package com.icss.vo;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Use {
	private Integer useid;
	private String usename;
	private String password;
	private String sex;
	private Integer age;
	private Date birthday;
	private String tel;
	private String useaddress;
	private String position;
	
	public Integer getUseid() {
		return useid;
	}
	public void setUseid(Integer useid) {
		this.useid = useid;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String username) {
		this.usename = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		/*Date date =birthday;
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");*/
		return birthday;
	}
	public void setBirthday(Date birthday) {
		
		this.birthday = birthday;
	} 
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getUseaddress() {
		return useaddress;
	}
	public void setUseaddress(String useaddress) {
		this.useaddress = useaddress;
	}
	@Override
	public String toString() {
		return "Use [useid=" + useid + ", username=" + usename + ", password=" + password + ", sex=" + sex + ", age=" + age
				+ ", birthday=" + birthday + ", tel=" + tel + ", position=" + position + ", useaddress=" + useaddress + "]";
	}
	
	
	
}
