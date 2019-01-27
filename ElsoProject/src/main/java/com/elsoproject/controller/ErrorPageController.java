package com.elsoproject.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;


@Controller
public class ErrorPageController implements ErrorController {
	
	private static final String ERR_PATH = "/error";
	
	private ErrorAttributes errorAtrributes;
	
	@Autowired
	public void setErrorAtrributes(ErrorAttributes errorAtrributes) {
		this.errorAtrributes = errorAtrributes;
	}
	
	@RequestMapping(ERR_PATH)
	public String error(Model model, HttpServletRequest request) {
		RequestAttributes rA = new ServletRequestAttributes(request);
//		Map<String,Object> error = this.errorAtrributes.getErrorAttributes(rA, true);
		
//		model.addAttribute("timestamp",error.get("timestamp"));
		
		return "detailedError";
	}


	@Override
	public String getErrorPath() {
		return ERR_PATH;
	}
	

}

