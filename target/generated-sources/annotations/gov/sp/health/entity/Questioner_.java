package gov.sp.health.entity;

import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T04:31:11")
@StaticMetamodel(Questioner.class)
public class Questioner_ { 

    public static volatile SingularAttribute<Questioner, Long> id;
    public static volatile SingularAttribute<Questioner, String> description;
    public static volatile SingularAttribute<Questioner, Date> createdAt;
    public static volatile SingularAttribute<Questioner, String> name;
    public static volatile SingularAttribute<Questioner, WebUser> retirer;
    public static volatile SingularAttribute<Questioner, Boolean> retired;
    public static volatile SingularAttribute<Questioner, String> retireComments;
    public static volatile SingularAttribute<Questioner, WebUser> creater;
    public static volatile SingularAttribute<Questioner, String> code;
    public static volatile SingularAttribute<Questioner, Date> retiredAt;

}