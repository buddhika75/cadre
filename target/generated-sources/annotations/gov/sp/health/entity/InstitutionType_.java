package gov.sp.health.entity;

import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:17:48")
@StaticMetamodel(InstitutionType.class)
public class InstitutionType_ { 

    public static volatile SingularAttribute<InstitutionType, Long> id;
    public static volatile SingularAttribute<InstitutionType, Integer> orderNo;
    public static volatile SingularAttribute<InstitutionType, Date> createdAt;
    public static volatile SingularAttribute<InstitutionType, String> description;
    public static volatile SingularAttribute<InstitutionType, WebUser> retirer;
    public static volatile SingularAttribute<InstitutionType, String> name;
    public static volatile SingularAttribute<InstitutionType, String> retireComments;
    public static volatile SingularAttribute<InstitutionType, String> tname;
    public static volatile SingularAttribute<InstitutionType, Boolean> retired;
    public static volatile SingularAttribute<InstitutionType, WebUser> creater;
    public static volatile SingularAttribute<InstitutionType, Date> retiredAt;
    public static volatile SingularAttribute<InstitutionType, String> sname;

}