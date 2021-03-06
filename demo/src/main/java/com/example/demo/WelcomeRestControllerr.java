package com.example.demo;



import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@ControllerAdvice
public class WelcomeRestControllerr {
	@GetMapping("/welcome")
	public String WelcomeMsg() {
		String msg = "Welcome to my Page users!!! hello all" ;
		return msg ;
		
	}
	

	public class ExceptionHandlerController {

	    public static final String DEFAULT_ERROR_VIEW = "error";

	    @ExceptionHandler(value = {Exception.class, RuntimeException.class})
	    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
	            ModelAndView mav = new ModelAndView(DEFAULT_ERROR_VIEW);

	        mav.addObject("datetime", new Date());
	        mav.addObject("exception", e);
	        mav.addObject("url", request.getRequestURL());
	        return mav;
	    }
	}

}


