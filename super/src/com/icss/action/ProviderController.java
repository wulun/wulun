package com.icss.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icss.service.ProviderService;
import com.icss.vo.Provider;

@Controller("providerController")
public class ProviderController {
	

	@Resource(name ="providerService")
	private ProviderService ps;

	public ProviderService getPs() {
		return ps;
	}

	public void setPs(ProviderService ps) {
		this.ps = ps;
	}
	//��ѯ���й�Ӧ��
	@RequestMapping("selectAll.action")
	public String selectAllProvider(Model model) {
		List<Provider> allProvider = ps.selectAllProvider();
		model.addAttribute("allProvider",allProvider);
		return "providerList";
	}
	//���ӹ�Ӧ��
	@RequestMapping("addProvider.action")
	public String insertClassFinal(@ModelAttribute Provider provider) throws UnsupportedEncodingException{
		byte[] b = provider.getProvidername().getBytes("ISO-8859-1");
		String str = new String(b,"UTF-8");
		provider.setProvidername(str);
		ps.insertProvider(provider);
		return "forward:selectAll.action";		
	}
	@RequestMapping("addProviderPage.action")
	// ���Ӱ༶ҳ����ת
	public ModelAndView indexPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("providerAdd");
		return mav;
	}
	//ɾ����Ӧ��
	@RequestMapping("deleteProvider.action")
	public String deleteProvider(HttpServletRequest request, Model model){
		int id = Integer.parseInt(request.getParameter("proid"));
		ps.deleteProviderById(id);
		return "forward:selectAll.action";
		
	}
	//��ѯ������Ӧ��
	@RequestMapping("providerView.action")
	public String selectByIdProvider(HttpServletRequest request, Model model){
		int proid = Integer .parseInt(request.getParameter("proid"));
		Provider provider = ps.selectByIdProvider(proid);
		model.addAttribute("provider",provider);
		return "providerView";
		
	}
	
	//�޸�ҳ��
	@RequestMapping("providerUpdatePage.action")
	public String updateProviderPage(HttpServletRequest request, Model model){
		int proid = Integer .parseInt(request.getParameter("proid"));
		Provider provider = ps.selectByIdProvider(proid);
		model.addAttribute("providerupdate",provider);
		return "providerUpdate";
		
	}
	//�����޸�
	@RequestMapping("providerUpdate.action")
	public String updateProviderById(@ModelAttribute Provider provider){
		ps.updateByIdProvider(provider);
		return "forward:selectAll.action";
		
	}
	//�鹩Ӧ��
	@RequestMapping("selectByProName.action")
	public String selectAllProviderCon(Model model) {
		List<Provider> allProvider = ps.selectAllProvider();
		model.addAttribute("pro",allProvider);
		return "billAdd";
	}

}
