package gov.sp.health.entity;

import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T04:31:11")
@StaticMetamodel(Sex.class)
public class Sex_ { 

    public static volatile SingularAttribute<Sex, Long> id;
    public static volatile SingularAttribute<Sex, String> description;
    public static volatile SingularAttribute<Sex, Date> createdAt;
    public static volatile SingularAttribute<Sex, String> name;
    public static volatile SingularAttribute<Sex, WebUser> retirer;
    public static volatile SingularAttribute<Sex, Boolean> retired;
    public static volatile SingularAttribute<Sex, String> retireComments;
    public static volatile SingularAttribute<Sex, WebUser> creater;
    public static volatile SingularAttribute<Sex, Date> retiredAt;

}