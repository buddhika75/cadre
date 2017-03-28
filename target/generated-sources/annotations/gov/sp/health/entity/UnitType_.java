package gov.sp.health.entity;

import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:17:48")
@StaticMetamodel(UnitType.class)
public class UnitType_ { 

    public static volatile SingularAttribute<UnitType, Long> id;
    public static volatile SingularAttribute<UnitType, String> description;
    public static volatile SingularAttribute<UnitType, Date> createdAt;
    public static volatile SingularAttribute<UnitType, String> name;
    public static volatile SingularAttribute<UnitType, WebUser> retirer;
    public static volatile SingularAttribute<UnitType, Boolean> retired;
    public static volatile SingularAttribute<UnitType, String> retireComments;
    public static volatile SingularAttribute<UnitType, WebUser> creater;
    public static volatile SingularAttribute<UnitType, Date> retiredAt;

}