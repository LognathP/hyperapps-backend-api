package com.hyperapps.util;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.hyperapps.logger.HyperAppsLogger;

@Aspect
@Component
public class HttpRequestResponseLoggingAspect {

	@Autowired
	HyperAppsLogger Logger;
	
	 @AfterReturning(value = "@annotation(LogHttpRequestResponse)", returning = "result")
	    public void logHttpRequestResponse(Object result) throws IOException {
	        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	        HttpServletRequest request = attributes.getRequest();
	        HttpServletResponse response = attributes.getResponse();
	        Map<String, Object> details = HttpUtils.getHttpRequestResponseDetails(request, response, result);
	        System.out.println("HTTP request and response details: " + details);
	        Logger.info(this.getClass(),"HTTP request and response details: " + details);
	    }
}
