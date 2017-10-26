package com.xinqiao.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    
    @RequestMapping("/to_welcome")//制定这个控制类对应的url  
    public String hello(Model model){  
    	logger.info("========>to_welcome");
        String message = "SpringMVC";  
        //为model添加Attribute  
        model.addAttribute("message",message);  
        return "welcome";  
    }  
//  public ModelAndView handleRequest(HttpServletRequest request,  
//          HttpServletResponse response) throws Exception {  
//        
//      //在页面上提示一行信息  
//      String message = "hello world!";  
//        
//      //通过request对象将信息在页面上展示  
//      //request.setAttribute("message", message);  
//        
//      ModelAndView modelAndView = new ModelAndView();  
//      // 相当于request.setAttribute(), 将数据传到页面展示  
//      //model数据  
//      modelAndView.addObject("message", message);  
//      //设置视图  
//      modelAndView.setViewName("hello");  
//        
//      return modelAndView;  
//  }  
}
