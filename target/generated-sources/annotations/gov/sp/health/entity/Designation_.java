package gov.sp.health.entity;

import gov.sp.health.entity.DesignationCategory;
import gov.sp.health.entity.DesignationLevel;
import gov.sp.health.entity.SalaryCode;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-30T01:56:22")
@StaticMetamodel(Designation.class)
public class Designation_ { 

    public static volatile SingularAttribute<Designation, SalaryCode> salaryCode;
    public static volatile SingularAttribute<Designation, Boolean> retired;
    public static volatile SingularAttribute<Designation, WebUser> creater;
    public static volatile SingularAttribute<Designation, String> sname;
    public static volatile SingularAttribute<Designation, Long> id;
    public static volatile SingularAttribute<Designation, DesignationCategory> category;
    public static volatile SingularAttribute<Designation, DesignationLevel> level;
    public static volatile SingularAttribute<Designation, Integer> orderNo;
    public static volatile SingularAttribute<Designation, String> description;
    public static volatile SingularAttribute<Designation, Date> createdAt;
    public static volatile SingularAttribute<Designation, String> name;
    public static volatile SingularAttribute<Designation, WebUser> retirer;
    public static volatile SingularAttribute<Designation, String> retireComments;
    public static volatile SingularAttribute<Designation, String> tname;
    public static volatile SingularAttribute<Designation, Date> retiredAt;

}