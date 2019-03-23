package com.icss.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icss.service.BillService;
import com.icss.vo.Bill;
import com.icss.vo.Provider;

@Controller("billController")
public class BillController {
	@Resource(name="billService")
	private BillService bs;
	public BillService getBs() {
		return bs;
	}

	public void setBs(BillService bs) {
		this.bs = bs;
	}
	//添加账单
	@RequestMapping("addbill.action")
	public String insertBill(HttpServletRequest request,Bill b) throws UnsupportedEncodingException{
		String name = request.getParameter("billname");
		byte[] a = name.getBytes("ISO-8859-1");
		String billname = new String(a,"UTF-8");
		int price = Integer.parseInt(request.getParameter("price"));
		int num = Integer.parseInt(request.getParameter("num"));
		int proid = Integer.parseInt(request.getParameter("proid"));
		int money = Integer.parseInt(request.getParameter("money"));
		String status = request.getParameter("status");
		b.setBillname(billname);
		b.setPrice(price);
		b.setNum(num);
		b.setProid(proid);
		b.setMoney(money);
		b.setStatus(status);
		bs.insertBillService(b);
		return "forward:selectBillAAA.action";
		
	}
	@RequestMapping("select.action")
	public String selectController(){
		return "billList";
		
	}
	//查询所有
	@RequestMapping("selectBillAll.action")
	public String selectBill(Model model,HttpServletRequest request,Bill b) throws UnsupportedEncodingException{
		String name = request.getParameter("billname");
		byte[] a = name.getBytes("ISO-8859-1");
		String billname = new String(a,"UTF-8");
		String status = request.getParameter("status");
		System.out.println(status);
		b.setBillname(billname);
		b.setStatus(status);
		List<Bill> list = bs.selectBillService(b);
		model.addAttribute("list", list);
		return "billList";
		
	}
	//查询所有
	@RequestMapping("selectBillAAA.action")
	public String selectBill(Model model,Bill b){
		List<Bill> list = bs.selectBillAllService();
		model.addAttribute("list", list);
		return "billList";
		
	}
	//删除
	@RequestMapping("deletebill.action")
	public String deleteBillController(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("bid"));
		bs.deleteBillService(id);
		return "forward:selectBillAAA.action";
		
	}
	//修改之查询
	@RequestMapping("updateselect.action")
	public String updateSelectController(HttpServletRequest request,Model model){
		int id = Integer.parseInt(request.getParameter("bid"));
		Bill b = bs.updateSelectService(id);
		model.addAttribute("bbb", b);
		return "billUpdate";
		
	}
	//修改
	@RequestMapping("update.action")
	public String updateController(Bill b) throws UnsupportedEncodingException{
		byte[] a = b.getBillname().getBytes("ISO-8859-1");
		String str = new String(a,"UTF-8");
		b.setBillname(str);
		bs.updateBillService(b);
		return "forward:selectBillAAA.action";
		
	}
	//查看单条信息
	@RequestMapping("selectById.action")
	public String selectByIdController(HttpServletRequest request,Model model){
		int id = Integer.parseInt(request.getParameter("bid"));
		Bill b = bs.selectByIdService(id);
		model.addAttribute("bsl",b);
		return "billView";
		
	}
}
