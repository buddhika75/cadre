package gov.sp.health.entity;

import gov.sp.health.entity.Designation;
import gov.sp.health.entity.InstitutionType;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:42:24")
@StaticMetamodel(InstitutionTypeCadre.class)
public class InstitutionTypeCadre_ { 

    public static volatile SingularAttribute<InstitutionTypeCadre, Long> id;
    public static volatile SingularAttribute<InstitutionTypeCadre, Date> createdAt;
    public static volatile SingularAttribute<InstitutionTypeCadre, String> description;
    public static volatile SingularAttribute<InstitutionTypeCadre, WebUser> retirer;
    public static volatile SingularAttribute<InstitutionTypeCadre, String> name;
    public static volatile SingularAttribute<InstitutionTypeCadre, Long> cadreCount;
    public static volatile SingularAttribute<InstitutionTypeCadre, String> retireComments;
    public static volatile SingularAttribute<InstitutionTypeCadre, Designation> designation;
    public static volatile SingularAttribute<InstitutionTypeCadre, InstitutionType> institutionType;
    public static volatile SingularAttribute<InstitutionTypeCadre, Boolean> retired;
    public static volatile SingularAttribute<InstitutionTypeCadre, WebUser> creater;
    public static volatile SingularAttribute<InstitutionTypeCadre, Date> retiredAt;

}