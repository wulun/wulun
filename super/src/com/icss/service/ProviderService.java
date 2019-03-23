package com.icss.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icss.dao.ProviderMapper;
import com.icss.vo.Provider;

@Service("providerService")
public class ProviderService {

	// ���з�������
	@Resource(name = "providerMapper")
	private ProviderMapper providerMapper;

	public ProviderMapper getProviderMapper() {
		return providerMapper;
	}

	public void setProviderMapper(ProviderMapper providerMapper) {
		this.providerMapper = providerMapper;
	}

	// ��ѯ���й�Ӧ��
	public List<Provider> selectAllProvider() {
		return providerMapper.selectAllProvider();
	}

	// ���ӹ�Ӧ��
	public void insertProvider(Provider provider) {
		providerMapper.insertProvider(provider);
	}

	// ɾ����Ӧ��
	public void deleteProviderById(Integer id) {
		providerMapper.deleteProviderById(id);
	}

	// ��ѯ������Ӧ��
	public Provider selectByIdProvider(Integer proid) {
		return providerMapper.selectById(proid);
	}

	// �޸�
	public void updateByIdProvider(Provider provider) {
		System.out.println(provider);
		providerMapper.updateProviderTrue(provider);
	}

}