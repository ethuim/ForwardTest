//package com.ertcorp.forwardtest.security;
//
//import javax.faces.annotation.FacesConfig;
//import javax.faces.application.ViewVisitOption;
//import javax.faces.context.FacesContext;
//import javax.faces.webapp.FacesServlet;
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// *
// * @author Eric Liang
// */
//@FacesConfig
//@WebListener
//public class ExtensionlessURLs implements ServletContextListener {
//
//    private static final Logger LOG = LoggerFactory.getLogger(ExtensionlessURLs.class);
//
//    @Override
//    public void contextInitialized(ServletContextEvent event) {
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        if (facesContext != null) {
//            event.getServletContext()
//                    .getServletRegistrations().values().stream()
//                    .filter(servlet -> servlet.getClassName().equals(FacesServlet.class.getName()))
//                    .findAny()
//                    .ifPresent(facesServlet -> facesContext
//                    .getApplication()
//                    .getViewHandler()
//                    .getViews(facesContext, "/", ViewVisitOption.RETURN_AS_MINIMAL_IMPLICIT_OUTCOME)
//                    .forEach(view -> facesServlet.addMapping(view))
//                    );
//        } else {
//            LOG.error("Faces Context was null");
//        }
//    }
//
//}
