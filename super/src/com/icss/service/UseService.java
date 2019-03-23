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
	
	
	//查询所有  先不分页
	public List<Use> selectAllService(){
		return ud.selectAllUse();
	}
	//查询个人信息
	public Use selectByIdService(Integer useid){
		return ud.selectById(useid);
	}
	
	//添加
	public void insertUseService(Use use){
		ud.insertUse(use);
	}
	//修改
	public void updateUseService(Use use){
		ud.updateUse(use);
	}
	//删除
	public void deleteUseService(Integer useid){
		ud.deleteUse(useid);
	}
	
	
	//计算总数据条数
	public int selectTotalService(){
	 return ud.selectUseTotal();
	}
	
	//查询之分页    curr 每页有几条数据          pagenum当前第几页
	public List<Use> selectPageService(Page page){
		return ud.selectPage(page);
		
	}
	//通过name查询
	public List<Use> selectNameService(Use use){
		return ud.selectByName(use);
	}
	
	//登录
	public Use loginService(Use use){
		return ud.login(use);

	}
	//修改密码
	public void updatePasswordService(Use use){
		ud.updatePassword(use);
	}
}
