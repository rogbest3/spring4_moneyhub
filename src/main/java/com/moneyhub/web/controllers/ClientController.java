package com.moneyhub.web.controllers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.moneyhub.web.domains.ClientDTO;


@Controller	// mvc 객체한테 controller 알려줌
@RequestMapping("/client/*")	// 
public class ClientController {
	private static final Logger logger = LoggerFactory.getLogger(ClientController.class);
	@Autowired Map<String, Object> map;
	@Autowired ClientDTO client;
	
	@PostMapping("/join")	//	/Moneyhub/count
	public @ResponseBody Map<?,?> join(@RequestBody ClientDTO user) {	

		HashMap<String, Object> map = new HashMap<>();
		logger.info("AJAX가 보낸 아이디와 비번 {} ", user.getCid() + ", " + user.getPwd());
		map.put("cid", user.getCid());
		map.put("pwd", user.getPwd());
		logger.info("map에 담긴 아이디와 비번 {} ", map.get("cid") + ", " + map.get("pwd"));
		return map;
	}
	
	@PostMapping("/login")
	public @ResponseBody ClientDTO login(@RequestBody ClientDTO param){
		logger.info("AJAX가 보낸 로그인 아이디와 비번 {} ", param.getCid() + ", " + param.getPwd());
		client.setCid(param.getCid());
		client.setPwd(param.getPwd());
		logger.info("client에 담긴 사용자 정보 : {}", client.toString());
		return client;
	}
}
