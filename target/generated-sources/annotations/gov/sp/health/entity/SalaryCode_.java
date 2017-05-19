package gov.sp.health.entity;

import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-30T01:56:22")
@StaticMetamodel(SalaryCode.class)
public class SalaryCode_ { 

    public static volatile SingularAttribute<SalaryCode, Long> id;
    public static volatile SingularAttribute<SalaryCode, String> description;
    public static volatile SingularAttribute<SalaryCode, Date> createdAt;
    public static volatile SingularAttribute<SalaryCode, String> name;
    public static volatile SingularAttribute<SalaryCode, WebUser> retirer;
    public static volatile SingularAttribute<SalaryCode, Boolean> retired;
    public static volatile SingularAttribute<SalaryCode, String> retireComments;
    public static volatile SingularAttribute<SalaryCode, WebUser> creater;
    public static volatile SingularAttribute<SalaryCode, Date> retiredAt;

}