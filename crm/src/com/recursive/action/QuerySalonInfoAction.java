package com.recursive.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.recursive.pojo.InfoVO;
import com.recursive.service.QuerySalonInfoService;


@Controller
@RequestMapping("/salonInfo")
public class QuerySalonInfoAction {

	@Autowired
	private QuerySalonInfoService querySalonInfoService;
	
	@RequestMapping(value = "/byIntention.action", method = RequestMethod.GET)
	public String selectInfoBySalonIntention(String salonIntention,Model model){
		System.out.println("salonIntention："+salonIntention);
		List<InfoVO> list = querySalonInfoService.selectInfoBySalonIntention(salonIntention, 0, 4);
		model.addAttribute("list", list);
		return "salon_info_list";
	}
	
	
	
	
}
