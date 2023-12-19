package com.hyperapps.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class CustomHeaderFilter extends OncePerRequestFilter {

	@Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String storeIdHeader = request.getHeader("storeId");
        String branchIdHeader = request.getHeader("branchId");

        if (storeIdHeader == null || branchIdHeader == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing required headers");
            return;
        }

        request.setAttribute("storeId", storeIdHeader);
        request.setAttribute("branchId", branchIdHeader);

        filterChain.doFilter(request, response);
    }
}
