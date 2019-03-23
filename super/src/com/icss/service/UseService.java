package com.icss.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.icss.dao.UseMapper;
import com.icss.vo.Page;
import com.icss.vo.Use;

@Service("useService")
public class UseService {
	@Resource(name="useMapper")
	private UseMapper ud;

	public UseMapper getUd() {
		return ud;
	}

	public void setUd(UseMapper ud) {
		this.ud = ud;
	}
	
	
	//��ѯ����  �Ȳ���ҳ
	public List<Use> selectAllService(){
		return ud.selectAllUse();
	}
	//��ѯ������Ϣ
	public Use selectByIdService(Integer useid){
		return ud.selectById(useid);
	}
	
	//���
	public void insertUseService(Use use){
		ud.insertUse(use);
	}
	//�޸�
	public void updateUseService(Use use){
		ud.updateUse(use);
	}
	//ɾ��
	public void deleteUseService(Integer useid){
		ud.deleteUse(useid);
	}
	
	
	//��������������
	public int selectTotalService(){
	 return ud.selectUseTotal();
	}
	
	//��ѯ֮��ҳ    curr ÿҳ�м�������          pagenum��ǰ�ڼ�ҳ
	public List<Use> selectPageService(Page page){
		return ud.selectPage(page);
		
	}
	//ͨ��name��ѯ
	public List<Use> selectNameService(Use use){
		return ud.selectByName(use);
	}
	
	//��¼
	public Use loginService(Use use){
		return ud.login(use);

	}
	//�޸�����
	public void updatePasswordService(Use use){
		ud.updatePassword(use);
	}
}
