package com.moneyhub.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.moneyhub.web.services.HrService;

@Controller
public class HrController {
	private static final Logger logger = LoggerFactory.getLogger(HrController.class);
	@Autowired HrService hrService;
}
