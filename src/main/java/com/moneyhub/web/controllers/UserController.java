package com.moneyhub.web.controllers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.moneyhub.web.domains.UserDTO;


@Controller	// mvc 객체한테 controller 알려줌
@RequestMapping("/user/*")	// 
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
//	@Autowired Map<String, String> map;
	
	@PostMapping("/join")	//	/Moneyhub/count
	public @ResponseBody Map<?,?> join(@RequestBody UserDTO user) {	
//		System.out.println("join 진입");
		Map<String, String> map = new HashMap<>();
		logger.info("AJAX가 보낸 아이디와 비번 {} ", user.getUid() + ", " + user.getPwd());
		map.put("uid", user.getUid());
		map.put("pwd", user.getPwd());
		logger.info("map에 담긴 아이디와 비번 {} ", map.get("uid") + ", " + map.get("pwd"));
		return map;
	}
	
	@PostMapping("/login")
	public @ResponseBody Map<?, ?> login(@RequestBody UserDTO user){
		Map<String, String> map = new HashMap<>();
		logger.info("AJAX가 보낸 로그인 아이디와 비번 {} ", user.getUid() + ", " + user.getPwd());
		map.put("uid", user.getUid());
		map.put("pwd", user.getPwd());
		logger.info("map에 담긴 로그인 아이디와 비번 {} ", map.get("uid") + ", " + map.get("pwd"));
		return map;
	}
}
