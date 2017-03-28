package gov.sp.health.entity;

import gov.sp.health.entity.Location;
import gov.sp.health.entity.Unit;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:42:24")
@StaticMetamodel(Location.class)
public class Location_ { 

    public static volatile SingularAttribute<Location, Boolean> retired;
    public static volatile SingularAttribute<Location, WebUser> creater;
    public static volatile SingularAttribute<Location, String> code;
    public static volatile SingularAttribute<Location, String> sname;
    public static volatile SingularAttribute<Location, Long> id;
    public static volatile SingularAttribute<Location, Unit> unit;
    public static volatile SingularAttribute<Location, String> description;
    public static volatile SingularAttribute<Location, Date> createdAt;
    public static volatile SingularAttribute<Location, String> name;
    public static volatile SingularAttribute<Location, WebUser> retirer;
    public static volatile SingularAttribute<Location, String> tname;
    public static volatile SingularAttribute<Location, String> retireComments;
    public static volatile SingularAttribute<Location, Date> retiredAt;
    public static volatile SingularAttribute<Location, Location> superLocation;

}