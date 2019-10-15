package com.moneyhub.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moneyhub.web.serviceimpls.MoneyhubServiceImpl;
import com.moneyhub.web.services.MoneyhubService;

@Controller	// mvc 객체한테 controller 알려줌
@RequestMapping("/moneyhub/*")	// 
public class MoneyhubController {
	private static final Logger logger = LoggerFactory.getLogger(MoneyhubController.class);
	@Autowired MoneyhubServiceImpl moneyhubService;	
	
	@GetMapping("/count")	//	/Moneyhub/count
	public String count(Model model) {	//model 이 sender 역할
		int count = moneyhubService.countClient();
		model.addAttribute("count", count);	//	mapping
		return "home";
	}
	
	@GetMapping("/info")		
	public String findClientbyCid(@RequestParam("cid") String cid, @RequestParam("pwd") String pwd ) {
		
		return "";
	}
}
