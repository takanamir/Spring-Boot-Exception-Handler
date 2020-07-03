package com.sample.my.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.my.exception.MyException;

@Controller
public class MyController {
	public static void main(String[] args) {
		SpringApplication.run(MyController.class, args);
	}

	@RequestMapping("/")
	public ModelAndView handleTop(ModelAndView mav) {
		mav.addObject("mymessage", "Hello, world.");
		mav.setViewName("myview");
		return mav;
	}

	@RequestMapping("/myexception")
	public ModelAndView handleMyException(ModelAndView mav) throws MyException {
		throw new MyException();
	}

	@RequestMapping("/exception")
	public ModelAndView handleException(ModelAndView mav) throws Exception {
		throw new Exception();
	}
}