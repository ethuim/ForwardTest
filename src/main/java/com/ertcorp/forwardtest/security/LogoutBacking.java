package com.ertcorp.forwardtest.security;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Eric Liang
 */
@Named
@RequestScoped
public class LogoutBacking {

    public String submit() {

        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

        return "/index.xhtml?faces-redirect=true";

    }

}
