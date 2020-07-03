package com.sample.my.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		System.out.println("MyHandlerExceptionResolver#resolveException");
		System.out.println(handler.getClass());
		System.out.println(handler);
		ModelAndView mav = new ModelAndView();
		mav.addObject("myerror", "MyHandlerExceptionResolver#resolveException");
		mav.setViewName("myview");
		mav.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		return mav;
	}
}