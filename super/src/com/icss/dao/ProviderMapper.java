package com.icss.dao;

import java.util.List;

import com.icss.vo.Provider;

public interface ProviderMapper {
	
	//查询所有供应商
	public List<Provider> selectAllProvider();
	//增加供应商
	public void insertProvider(Provider provider);
	//删除供应商
	public void deleteProviderById(Integer proid);
	//查看详情
	public Provider selectById(Integer proid);
	//修改
	public void updateProviderTrue(Provider provider);
	

}
