package com.ertcorp.forwardtest.security;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Eric Liang
 */
@Startup
@Singleton
public class StartupBean {
    private static final Logger LOG = LoggerFactory.getLogger(StartupBean.class);
    @PostConstruct
    public void init(){
        LOG.info("Startup Bean");
    }
}
