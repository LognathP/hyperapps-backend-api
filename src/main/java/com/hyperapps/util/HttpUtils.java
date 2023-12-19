package com.hyperapps.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerMapping;

public class HttpUtils {

	  @SuppressWarnings("unchecked")
	  public static Map<String, Object> getHttpRequestResponseDetails(HttpServletRequest request, HttpServletResponse response,Object result) throws IOException {
		    Map<String, Object> requestParams = new HashMap<>();

		    Map<String, String> pathVariables = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		    if (pathVariables != null) {
		        requestParams.putAll(pathVariables);
		    }
		    
		    Enumeration<String> paramNames = request.getParameterNames();
		    while (paramNames.hasMoreElements()) {
		        String paramName = paramNames.nextElement();
		        String paramValue = request.getParameter(paramName);
		        requestParams.put(paramName, paramValue);
		    }
		  
		  	Map<String, Object> details = new HashMap<>();
	        details.put("method", request.getMethod());
	        details.put("url", request.getRequestURL().toString());
	        details.put("requestParams", requestParams);
	        details.put("requestBody",  getRequestBody(request));
	        //details.put("responseBody", ((ResponseEntity<APIResponse>) result).getBody()); 
	        return Collections.unmodifiableMap(details);
	    }
	   
	   private static StringBuilder getRequestBody(HttpServletRequest request) throws IOException {
	        HttpServletRequestWrapper requestWrapper = new HttpServletRequestWrapper(request);
	        ServletInputStream inputStream = requestWrapper.getInputStream();
	        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
	        String line = null;
	        StringBuilder requestBody = new StringBuilder();
	        while ((line = reader.readLine()) != null) {
	            requestBody.append(line);
	        }
	        return requestBody;
	    }

}

