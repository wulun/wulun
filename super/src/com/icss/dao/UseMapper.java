package com.icss.dao;

import java.util.List;

import com.icss.vo.Page;
import com.icss.vo.Use;

public interface UseMapper {
	//��ѯ����  ����ҳ
	public List<Use> selectAllUse();
	//��ѯ����������
	public int  selectUseTotal();
	//��ѯ֮��ҳ    curr ÿҳ�м�������          pagenum��ǰ�ڼ�ҳ
	public List<Use> selectPage(Page page);
	
	//��ѯ������Ϣ   Ҳ���޸�֮��ѯ
	public Use selectById(Integer useid);
	//���
	public void insertUse(Use use);
	//�޸�
	public void updateUse(Use use);
	//ɾ��
	public void deleteUse(Integer useid);
	
	//��¼
	public Use login(Use use);
	//�޸�����
	public void updatePassword(Use use);
	//ͨ�����ֲ�ѯ
	public List<Use> selectByName(Use use);
	

}
