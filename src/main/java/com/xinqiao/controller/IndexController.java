package com.xinqiao.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);  
	@RequestMapping("/index")
	public String list(HttpServletRequest request){
		logger.info("========>infoto index");
		logger.error("========>errorto index");
		logger.debug("========>debugto index");
		logger.warn("======>warn");
		return "index";
	}
	
}
