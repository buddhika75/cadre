package gov.sp.health.entity;

import gov.sp.health.entity.Area;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-30T01:56:22")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Boolean> retired;
    public static volatile SingularAttribute<Area, WebUser> creater;
    public static volatile SingularAttribute<Area, String> code;
    public static volatile SingularAttribute<Area, String> sname;
    public static volatile SingularAttribute<Area, Area> superArea;
    public static volatile SingularAttribute<Area, Long> id;
    public static volatile SingularAttribute<Area, String> description;
    public static volatile SingularAttribute<Area, Date> createdAt;
    public static volatile SingularAttribute<Area, String> name;
    public static volatile SingularAttribute<Area, WebUser> retirer;
    public static volatile SingularAttribute<Area, String> tname;
    public static volatile SingularAttribute<Area, String> retireComments;
    public static volatile SingularAttribute<Area, Date> retiredAt;

}