package com.icss.dao;

import java.util.List;

import com.icss.vo.Provider;

public interface ProviderMapper {
	
	//��ѯ���й�Ӧ��
	public List<Provider> selectAllProvider();
	//���ӹ�Ӧ��
	public void insertProvider(Provider provider);
	//ɾ����Ӧ��
	public void deleteProviderById(Integer proid);
	//�鿴����
	public Provider selectById(Integer proid);
	//�޸�
	public void updateProviderTrue(Provider provider);
	

}
