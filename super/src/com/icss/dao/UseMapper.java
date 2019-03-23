package com.icss.dao;

import java.util.List;

import com.icss.vo.Page;
import com.icss.vo.Use;

public interface UseMapper {
	//查询所有  并分页
	public List<Use> selectAllUse();
	//查询总数据条数
	public int  selectUseTotal();
	//查询之分页    curr 每页有几条数据          pagenum当前第几页
	public List<Use> selectPage(Page page);
	
	//查询个人信息   也是修改之查询
	public Use selectById(Integer useid);
	//添加
	public void insertUse(Use use);
	//修改
	public void updateUse(Use use);
	//删除
	public void deleteUse(Integer useid);
	
	//登录
	public Use login(Use use);
	//修改密码
	public void updatePassword(Use use);
	//通过名字查询
	public List<Use> selectByName(Use use);
	

}
