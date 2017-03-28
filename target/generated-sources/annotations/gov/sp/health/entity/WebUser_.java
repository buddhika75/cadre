package gov.sp.health.entity;

import gov.sp.health.entity.Person;
import gov.sp.health.entity.WebTheme;
import gov.sp.health.entity.WebUser;
import gov.sp.health.entity.WebUserRole;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T04:31:11")
@StaticMetamodel(WebUser.class)
public class WebUser_ { 

    public static volatile SingularAttribute<WebUser, Date> activatedAt;
    public static volatile SingularAttribute<WebUser, String> defLocale;
    public static volatile SingularAttribute<WebUser, Boolean> retired;
    public static volatile SingularAttribute<WebUser, WebTheme> userWebTheme;
    public static volatile SingularAttribute<WebUser, WebUser> creater;
    public static volatile SingularAttribute<WebUser, String> primeTheme;
    public static volatile SingularAttribute<WebUser, Long> id;
    public static volatile SingularAttribute<WebUser, String> activateComments;
    public static volatile SingularAttribute<WebUser, String> webUserPassword;
    public static volatile SingularAttribute<WebUser, String> description;
    public static volatile SingularAttribute<WebUser, Date> createdAt;
    public static volatile SingularAttribute<WebUser, WebUser> retirer;
    public static volatile SingularAttribute<WebUser, String> name;
    public static volatile SingularAttribute<WebUser, Boolean> activated;
    public static volatile SingularAttribute<WebUser, String> retireComments;
    public static volatile SingularAttribute<WebUser, WebUserRole> role;
    public static volatile SingularAttribute<WebUser, WebUser> activator;
    public static volatile SingularAttribute<WebUser, Date> retiredAt;
    public static volatile SingularAttribute<WebUser, Person> webUserPerson;

}