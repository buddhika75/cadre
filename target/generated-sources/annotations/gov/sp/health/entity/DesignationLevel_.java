package gov.sp.health.entity;

import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-30T01:56:22")
@StaticMetamodel(DesignationLevel.class)
public class DesignationLevel_ { 

    public static volatile SingularAttribute<DesignationLevel, Long> id;
    public static volatile SingularAttribute<DesignationLevel, Integer> orderNo;
    public static volatile SingularAttribute<DesignationLevel, Date> createdAt;
    public static volatile SingularAttribute<DesignationLevel, String> description;
    public static volatile SingularAttribute<DesignationLevel, WebUser> retirer;
    public static volatile SingularAttribute<DesignationLevel, String> name;
    public static volatile SingularAttribute<DesignationLevel, String> retireComments;
    public static volatile SingularAttribute<DesignationLevel, String> tname;
    public static volatile SingularAttribute<DesignationLevel, Boolean> retired;
    public static volatile SingularAttribute<DesignationLevel, WebUser> creater;
    public static volatile SingularAttribute<DesignationLevel, Date> retiredAt;
    public static volatile SingularAttribute<DesignationLevel, String> sname;

}