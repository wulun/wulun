package com.icss.action;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.icss.service.UseService;
import com.icss.vo.Page;
import com.icss.vo.Use;

@Controller("useController")
public class UseController {
	@Resource(name = "useService")
	private UseService us;

	public UseService getUs() {
		return us;
	}

	public void setUs(UseService us) {
		this.us = us;
	}
	// 添加之添加页面的跳转
  
	@RequestMapping("insertPage.action")
	public String insertPage() {
		return "userAdd";
	}

	// 添加之真正添加
	@RequestMapping("insertUse.action")
	public String insertUse(HttpServletRequest request) throws UnsupportedEncodingException, ParseException{
			
		int useid=Integer.parseInt(request.getParameter("useid"));
		byte[] a =request.getParameter("usename").getBytes("ISO-8859-1");
		String usename=new String(a,"UTF-8");
		System.out.println(usename);
		String password=request.getParameter("password");
		int age=Integer.parseInt(request.getParameter("age"));
		byte[] s =request.getParameter("sex").getBytes("ISO-8859-1");
		String sex=new String(s,"UTF-8");
		System.out.println(sex);
		String birthday=request.getParameter("birthday");
		Date date=new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		date=sdf.parse(birthday);
		String tel=request.getParameter("tel");
		byte[] u =request.getParameter("useaddress").getBytes("ISO-8859-1");
		String useaddress=new String(u,"UTF-8");
		System.out.println(useaddress);
		String position=request.getParameter("position");
		Use use = new Use();
		use.setUseid(useid);
		use.setUsename(usename);
		use.setPassword(password);
		use.setAge(age);
		use.setSex(sex);
		use.setBirthday(date);
		use.setTel(tel);
		use.setUseaddress(useaddress);
		use.setPosition(position);
		us.insertUseService(use);
		return "forward:selectAllUse.action";
	}
	
	//查询所有
	@RequestMapping("selectAllUse.action")
	public String  selectAll(Model model){
		model.addAttribute("useList",us.selectAllService());
		return "userList";
	}
	
	//通过name查询
	@RequestMapping("selectByName.action")
	public String selectByName(HttpServletRequest request,Model model) throws UnsupportedEncodingException{
		Use use = new Use();
		System.out.println("========================="+request.getParameter("name"));
		byte[] a =request.getParameter("name").getBytes("ISO-8859-1");
		String usename=new String(a,"UTF-8");
		System.out.println(usename);
		if(usename==null || usename.equals("")){
			System.out.println("我进来了");
			return "forward:selectAllUse.action";
		}else{
			use.setUsename(usename);
			model.addAttribute("useList", us.selectNameService(use));
			return "userList";
		}
		
		
		
	}
	//查询个人信息
	@RequestMapping("userView.action")
	public String selectById(HttpServletRequest request,Model model){
		int useid = Integer.parseInt(request.getParameter("useid"));
		Use use =us.selectByIdService(useid);
		Date date=new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str=sdf.format(date);
		System.out.println(str);
		model.addAttribute("str",str);
		
		model.addAttribute("use", use);
		return "userView";
	}
	//修改之查询
	@RequestMapping("userUpdatePage.action")
	public String updatePage(HttpServletRequest request ,Model model){
		int useid = Integer.parseInt(request.getParameter("useid"));
		model.addAttribute("useupdate",us.selectByIdService(useid) );
		return "userUpdate";
			
	}
	//修改之真正修改
	@RequestMapping("userUpdate.action")
	public String updateUse(HttpServletRequest request) throws UnsupportedEncodingException, ParseException{
		int useid=Integer.parseInt(request.getParameter("useid"));
		byte[] a =request.getParameter("usename").getBytes("ISO-8859-1");
		String usename=new String(a,"UTF-8");
		byte[] s =request.getParameter("sex").getBytes("ISO-8859-1");
		String sex=new String(s,"UTF-8");
		String password=request.getParameter("password");
		int age=Integer.parseInt(request.getParameter("age"));
		String birthday=request.getParameter("birthday");
		Date date=new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		date=sdf.parse(birthday);
		String tel=request.getParameter("tel");
		byte[] u =request.getParameter("useaddress").getBytes("ISO-8859-1");
		String useaddress=new String(u,"UTF-8");
		System.out.println(useaddress);
		String position=request.getParameter("position");
		Use use = new Use();
		use.setUseid(useid);
		use.setUsename(usename);
		use.setSex(sex);
		use.setPassword(password);
		use.setAge(age);
		use.setBirthday(date);
		use.setTel(tel);
		use.setUseaddress(useaddress);
		use.setPosition(position);
		us.updateUseService(use);
		return "forward:selectAllUse.action";
	}
	
	//删除
	@RequestMapping("userDelete.action")
	public String deleteUse(HttpServletRequest request){
		int useid=Integer.parseInt(request.getParameter("useid"));
		us.deleteUseService(useid);
		return "forward:selectAllUse.action";
	}
	
	
	//分页查询所有
	/*@RequestMapping("selectAllPage.action")
	public String selectPage(Model model){
		//每页7条数据
		Page page =new Page();
		Integer curr=7;
		page.setCurr(curr);
		//总数据条数
		Integer dateSize=us.selectTotalService();
		page.setDateSize(dateSize);
		//总页数
		Integer pageTotal=dateSize % curr == 0? dateSize/curr : dateSize/curr+1;
		page.setPageTotal(pageTotal);
		////查询之分页    curr 每页有几条数据          pagenum当前第几页
		Integer pageNum=1;
		page.setPageNum(pageNum);
		//第一页的数据
		List<Use> useList=us.selectPageService(page);
		model.addAttribute("page", page);
		model.addAttribute("useList", useList);
		
		return "userList";
	}*/
	
	//登录
	@RequestMapping("login.action")
	public String login(HttpServletRequest request,Model model){
		Use use=new Use();
		String usename=request.getParameter("usename");
		String password=request.getParameter("password");
		use.setUsename(usename);
		use.setPassword(password);
		Use use2=new Use();
		use2=us.loginService(use);
		if(use2==null){
			request.setAttribute("msg","用户名不存在或者输入错误" );
			return "login";
		}else {
			//上下文对象
		
			//获得session对象
			HttpSession session = request.getSession();
			//将登陆成功后的用户名和 ID传到前台
			session.setAttribute("usename", use2.getUsename());
			session.setAttribute("useid", use2.getUseid());
			if("0".equals(use2.getPosition())){
				model.addAttribute("use",use2);
				return "index";
			}
			else if("1".equals(use2.getPosition())){
				model.addAttribute("use",use2);
				return "indexuse";
			}
			else{
				System.out.println("用户还在审核中,请等待!");
				request.setAttribute("msg","用户还在审核中,请等待!" );
				return "login";
			}
		}
	}
	//修改密码之页面跳转
	@RequestMapping("passwordPage.action")
	public String updatePasswordPage(){
		return "password";
	}
	//修改密码
	@RequestMapping("password.action")
	public String updatePassword(HttpServletRequest request,Model model){
		int useid=Integer.parseInt(request.getParameter("useid"));
			//获得密码
		String newpw=request.getParameter("newPassword");
		//获得确定密码
		String password=request.getParameter("reNewPassword");
		Use use =new Use();
		if(newpw.equals(password)){
			use.setUseid(useid);
			use.setPassword(password);
			System.out.println(use);
			us.updatePasswordService(use);
			
			model.addAttribute("msg", "修改成功请重新登录");
			return "login";
		}else {
			return "password";
		}
	/*	return "login";*/
	}
	

}
