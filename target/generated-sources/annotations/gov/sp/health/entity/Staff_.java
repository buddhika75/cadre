package gov.sp.health.entity;

import gov.sp.health.entity.Area;
import gov.sp.health.entity.Designation;
import gov.sp.health.entity.Institution;
import gov.sp.health.entity.Location;
import gov.sp.health.entity.Unit;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:17:48")
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile SingularAttribute<Staff, Long> id;
    public static volatile SingularAttribute<Staff, Unit> unit;
    public static volatile SingularAttribute<Staff, Area> area;
    public static volatile SingularAttribute<Staff, Location> location;
    public static volatile SingularAttribute<Staff, Date> createdAt;
    public static volatile SingularAttribute<Staff, String> description;
    public static volatile SingularAttribute<Staff, WebUser> retirer;
    public static volatile SingularAttribute<Staff, String> name;
    public static volatile SingularAttribute<Staff, String> retireComments;
    public static volatile SingularAttribute<Staff, Boolean> retired;
    public static volatile SingularAttribute<Staff, Designation> designation;
    public static volatile SingularAttribute<Staff, WebUser> creater;
    public static volatile SingularAttribute<Staff, Date> retiredAt;
    public static volatile SingularAttribute<Staff, Institution> institution;

}