package com.xinqiao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController  {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);  
	
    @RequestMapping(value="/login")  
    public String login(HttpSession session,String username,String password) throws Exception{        
        
    	logger.info("========>login登陆,在Session里保存信息  ");
        session.setAttribute("username", username);  
        
        return "redirect:to_welcome";   
    }  
      
   
    @RequestMapping(value="/logout")  
    public String logout(HttpSession session) throws Exception{  
    	logger.info("========>logout,清除Session  ");
        session.invalidate();  
          
        return "redirect:to_welcome";  
    }  
    
/*    @RequestMapping("/to_welcome")
    public String hello(Model model){  
    	logger.info("========>to_welcome");
        String message = "SpringMVC";  
        //为model添加Attribute  
        model.addAttribute("message",message);  
        return "welcome";  
    } */ 
    
  @RequestMapping("/to_welcome")  
  public String handleRequest(HttpServletRequest request,  
          HttpServletResponse response) throws Exception {  
        
      String message = "hello world!";  
      logger.info("========>to_welcome, "+ message);
      //通过request对象将信息在页面上展示  
      
        
      ModelAndView modelAndView = new ModelAndView();  
      request.setAttribute("message2", "message2");  
      modelAndView.addObject("message", message);  
      //设置视图  
   //   modelAndView.setViewName("welcome");  
        
      return "welcome";  
  }  
}
