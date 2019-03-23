package com.icss.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icss.dao.ProviderMapper;
import com.icss.vo.Provider;

@Service("providerService")
public class ProviderService {

	// 进行方法调用
	@Resource(name = "providerMapper")
	private ProviderMapper providerMapper;

	public ProviderMapper getProviderMapper() {
		return providerMapper;
	}

	public void setProviderMapper(ProviderMapper providerMapper) {
		this.providerMapper = providerMapper;
	}

	// 查询所有供应商
	public List<Provider> selectAllProvider() {
		return providerMapper.selectAllProvider();
	}

	// 增加供应商
	public void insertProvider(Provider provider) {
		providerMapper.insertProvider(provider);
	}

	// 删除供应商
	public void deleteProviderById(Integer id) {
		providerMapper.deleteProviderById(id);
	}

	// 查询单个供应商
	public Provider selectByIdProvider(Integer proid) {
		return providerMapper.selectById(proid);
	}

	// 修改
	public void updateByIdProvider(Provider provider) {
		System.out.println(provider);
		providerMapper.updateProviderTrue(provider);
	}

}