package com.ertcorp.forwardtest.security;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;
import javax.security.enterprise.authentication.mechanism.http.CustomFormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;

/**
 * This class is needed to activate JSF and configure it to be the right
 * version. Without this being present an explicit mapping of the FacesServlet
 * in web.xml would be required, but JSF 2.3 would then run in a JSF 2.2
 * compatibility mode.
 *
 * @author Arjan Tijms
 */
@CustomFormAuthenticationMechanismDefinition(
        loginToContinue = @LoginToContinue(loginPage = "/login.xhtml", errorPage = "")
)
@FacesConfig(version = JSF_2_3)
@ApplicationScoped
public class ApplicationInit {

}
