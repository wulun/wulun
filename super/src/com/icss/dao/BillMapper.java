package com.icss.dao;

import java.util.List;

import com.icss.vo.Bill;
import com.icss.vo.Provider;

public interface BillMapper {
	//添加账单
	public void addBill(Bill b);
	//修改之查询
	public Bill updateSelect(Integer id);
	//修改账单
	public void updateBill(Bill b);
	//删除
	public void deleteBill(Integer id);
	//查询所有
	public List<Bill> selectBillAll();
	//查询所有
	public List<Bill> selectBill(Bill b);
	//查看单条数据详细信息
	public Bill selectById(Integer id);
	
	
}
