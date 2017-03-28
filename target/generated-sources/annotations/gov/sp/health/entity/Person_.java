package gov.sp.health.entity;

import gov.sp.health.entity.Area;
import gov.sp.health.entity.Institution;
import gov.sp.health.entity.Location;
import gov.sp.health.entity.Sex;
import gov.sp.health.entity.Unit;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T02:58:01")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, String> otherName;
    public static volatile SingularAttribute<Person, Location> location;
    public static volatile SingularAttribute<Person, String> familyName;
    public static volatile SingularAttribute<Person, Boolean> retired;
    public static volatile SingularAttribute<Person, WebUser> creater;
    public static volatile SingularAttribute<Person, String> givenName;
    public static volatile SingularAttribute<Person, String> sname;
    public static volatile SingularAttribute<Person, Long> id;
    public static volatile SingularAttribute<Person, Unit> unit;
    public static volatile SingularAttribute<Person, Area> area;
    public static volatile SingularAttribute<Person, String> description;
    public static volatile SingularAttribute<Person, Date> createdAt;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile SingularAttribute<Person, WebUser> retirer;
    public static volatile SingularAttribute<Person, String> retireComments;
    public static volatile SingularAttribute<Person, String> tname;
    public static volatile SingularAttribute<Person, Sex> personSex;
    public static volatile SingularAttribute<Person, Date> retiredAt;
    public static volatile SingularAttribute<Person, Date> dOB;
    public static volatile SingularAttribute<Person, Institution> institution;
    public static volatile SingularAttribute<Person, Double> heightInMeters;

}