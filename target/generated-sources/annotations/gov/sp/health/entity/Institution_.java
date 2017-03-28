package gov.sp.health.entity;

import gov.sp.health.entity.Area;
import gov.sp.health.entity.Category;
import gov.sp.health.entity.Country;
import gov.sp.health.entity.Institution;
import gov.sp.health.entity.InstitutionContact;
import gov.sp.health.entity.InstitutionType;
import gov.sp.health.entity.Province;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:17:48")
@StaticMetamodel(Institution.class)
public class Institution_ { 

    public static volatile SingularAttribute<Institution, Area> mohArea;
    public static volatile SingularAttribute<Institution, String> fax;
    public static volatile SingularAttribute<Institution, String> website;
    public static volatile SingularAttribute<Institution, Category> oldCategory;
    public static volatile SingularAttribute<Institution, InstitutionType> institutionType;
    public static volatile SingularAttribute<Institution, Institution> superInstitution;
    public static volatile SingularAttribute<Institution, Boolean> retired;
    public static volatile ListAttribute<Institution, InstitutionContact> institutionContacts;
    public static volatile SingularAttribute<Institution, WebUser> creater;
    public static volatile SingularAttribute<Institution, String> code;
    public static volatile SingularAttribute<Institution, String> sname;
    public static volatile SingularAttribute<Institution, Boolean> outSide;
    public static volatile SingularAttribute<Institution, Country> country;
    public static volatile SingularAttribute<Institution, Long> id;
    public static volatile SingularAttribute<Institution, String> email;
    public static volatile SingularAttribute<Institution, String> address;
    public static volatile SingularAttribute<Institution, Date> createdAt;
    public static volatile SingularAttribute<Institution, String> description;
    public static volatile SingularAttribute<Institution, WebUser> retirer;
    public static volatile SingularAttribute<Institution, String> name;
    public static volatile SingularAttribute<Institution, String> tname;
    public static volatile SingularAttribute<Institution, String> retireComments;
    public static volatile SingularAttribute<Institution, Province> province;
    public static volatile SingularAttribute<Institution, Area> dpdhsArea;
    public static volatile SingularAttribute<Institution, Date> retiredAt;
    public static volatile SingularAttribute<Institution, String> telephone;
    public static volatile SingularAttribute<Institution, String> comments;
    public static volatile SingularAttribute<Institution, String> mobile;

}