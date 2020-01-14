package com.ertcorp.forwardtest.security;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Eric Liang
 */
@WebFilter(filterName = "GroupFilter")
public class GroupFilter implements Filter {

    private static final Logger log = LoggerFactory.getLogger(GroupFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        String servletPath = request.getServletPath();
        String requestURI = request.getRequestURI();
        log.info("ServletPath: {} RequestURI: {}", servletPath, requestURI);

        if (servletPath.contains("/Admin/management")) {
            RequestDispatcher rd;
            String path = "/Admin/adminLogin";
            log.info("Forwarding to " + path);
            rd = request.getRequestDispatcher(path);

            try {
                rd.forward(request, response);
            } catch (ServletException | IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            chain.doFilter(request, response);
        }
    }

}
