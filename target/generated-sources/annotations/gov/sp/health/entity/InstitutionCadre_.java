package gov.sp.health.entity;

import gov.sp.health.entity.Designation;
import gov.sp.health.entity.Institution;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:17:48")
@StaticMetamodel(InstitutionCadre.class)
public class InstitutionCadre_ { 

    public static volatile SingularAttribute<InstitutionCadre, Long> maleAndFemaleIn;
    public static volatile SingularAttribute<InstitutionCadre, Long> maleIn;
    public static volatile SingularAttribute<InstitutionCadre, Boolean> retired;
    public static volatile SingularAttribute<InstitutionCadre, Designation> designation;
    public static volatile SingularAttribute<InstitutionCadre, WebUser> creater;
    public static volatile SingularAttribute<InstitutionCadre, Long> femaleIn;
    public static volatile SingularAttribute<InstitutionCadre, Long> id;
    public static volatile SingularAttribute<InstitutionCadre, Long> approved;
    public static volatile SingularAttribute<InstitutionCadre, String> description;
    public static volatile SingularAttribute<InstitutionCadre, Date> createdAt;
    public static volatile SingularAttribute<InstitutionCadre, WebUser> retirer;
    public static volatile SingularAttribute<InstitutionCadre, Integer> intMonth;
    public static volatile SingularAttribute<InstitutionCadre, String> name;
    public static volatile SingularAttribute<InstitutionCadre, String> retireComments;
    public static volatile SingularAttribute<InstitutionCadre, Long> vac;
    public static volatile SingularAttribute<InstitutionCadre, Date> retiredAt;
    public static volatile SingularAttribute<InstitutionCadre, Integer> intYear;
    public static volatile SingularAttribute<InstitutionCadre, Institution> institution;

}