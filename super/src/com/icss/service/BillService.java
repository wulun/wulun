package com.icss.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.icss.dao.BillMapper;
import com.icss.vo.Bill;
import com.icss.vo.Provider;

@Service("billService")
public class BillService {
	@Resource(name="billMapper")
	private BillMapper bi;
	public BillMapper getBi() {
		return bi;
	}
	public void setBi(BillMapper bi) {
		this.bi = bi;
	}
	
	//增加
	public void insertBillService(Bill b){
		bi.addBill(b);
	}
	//修改之查询
	public Bill updateSelectService(Integer id){
		return bi.updateSelect(id);
	}
	//修改 
	public void updateBillService(Bill b){
		bi.updateBill(b);
	}
	//查询
	public List<Bill> selectBillAllService(){
		return bi.selectBillAll();
	}
	//查询改
	public List<Bill> selectBillService(Bill b){
			return bi.selectBill(b);
		
	}
	//删除
	public void deleteBillService(Integer id){
		bi.deleteBill(id);
	}
	
	//查看单个详细信息
	public Bill selectByIdService(Integer id){
		return bi.selectById(id);
	}
	
	
}
