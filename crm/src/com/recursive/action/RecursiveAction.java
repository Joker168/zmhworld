package com.recursive.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.recursive.util.ConfigUtil;
import com.recursive.util.SignUtil;

@Controller
@RequestMapping("/recursive")
public class RecursiveAction {
@RequestMapping("/test.action")
public ModelAndView test(){
	ModelAndView model=new ModelAndView("/test");
	return model;
}
//成为开发者
@RequestMapping(value="/tobecoder.action",method=RequestMethod.GET)
public void tobercoder(HttpServletRequest request,HttpServletResponse response) throws IOException{
String signature=request.getParameter("signature");
String timestamp=request.getParameter("timestamp");
String nonce=request.getParameter("nonce");
String echostr=request.getParameter("echostr");
if (signature == null) {
	response.getWriter().write("参数错误");
} else if (SignUtil.validSign(signature, ConfigUtil.getValue("token"), timestamp, nonce)) {
	System.out.println("验证成功");
	response.getWriter().write(echostr);
} else {
	System.out.println("验证失败");
	response.getWriter().write("fail");
}
}
@RequestMapping(value="/tobecoder.action",method=RequestMethod.POST)
public void authorization(HttpServletRequest request,HttpServletResponse response){
String code = request.getParameter("code");
System.out.println("code----------"+code);



}
}
