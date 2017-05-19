package gov.sp.health.entity;

import gov.sp.health.entity.Area;
import gov.sp.health.entity.Category;
import gov.sp.health.entity.Designation;
import gov.sp.health.entity.Finding;
import gov.sp.health.entity.Institution;
import gov.sp.health.entity.Location;
import gov.sp.health.entity.Person;
import gov.sp.health.entity.Unit;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-30T01:56:22")
@StaticMetamodel(Finding.class)
public class Finding_ { 

    public static volatile SingularAttribute<Finding, Person> person;
    public static volatile SingularAttribute<Finding, Location> location;
    public static volatile SingularAttribute<Finding, Designation> designation;
    public static volatile SingularAttribute<Finding, Boolean> retired;
    public static volatile SingularAttribute<Finding, Finding> derivedFrom;
    public static volatile SingularAttribute<Finding, String> stringValue;
    public static volatile SingularAttribute<Finding, Double> doubleValue;
    public static volatile SingularAttribute<Finding, WebUser> creater;
    public static volatile SingularAttribute<Finding, Date> fromTime;
    public static volatile SingularAttribute<Finding, Boolean> booleanValue;
    public static volatile SingularAttribute<Finding, Boolean> calculated;
    public static volatile SingularAttribute<Finding, Long> id;
    public static volatile SingularAttribute<Finding, String> lobStringValue;
    public static volatile SingularAttribute<Finding, Date> theTime;
    public static volatile SingularAttribute<Finding, Area> area;
    public static volatile SingularAttribute<Finding, Date> createdAt;
    public static volatile SingularAttribute<Finding, String> description;
    public static volatile SingularAttribute<Finding, WebUser> retirer;
    public static volatile SingularAttribute<Finding, String> name;
    public static volatile SingularAttribute<Finding, String> retireComments;
    public static volatile SingularAttribute<Finding, Boolean> completed;
    public static volatile SingularAttribute<Finding, Institution> institution;
    public static volatile SingularAttribute<Finding, Date> toDate;
    public static volatile SingularAttribute<Finding, String> code;
    public static volatile SingularAttribute<Finding, Date> toTime;
    public static volatile SingularAttribute<Finding, Unit> unit;
    public static volatile SingularAttribute<Finding, Category> category;
    public static volatile SingularAttribute<Finding, Date> theDate;
    public static volatile SingularAttribute<Finding, Date> fromDate;
    public static volatile SingularAttribute<Finding, Long> longValue;
    public static volatile SingularAttribute<Finding, Boolean> registered;
    public static volatile SingularAttribute<Finding, Boolean> actual;
    public static volatile SingularAttribute<Finding, Date> retiredAt;

}