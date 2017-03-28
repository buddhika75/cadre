package gov.sp.health.entity;

import gov.sp.health.entity.Institution;
import gov.sp.health.entity.UnitType;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:17:48")
@StaticMetamodel(Unit.class)
public class Unit_ { 

    public static volatile SingularAttribute<Unit, Long> id;
    public static volatile SingularAttribute<Unit, UnitType> unitType;
    public static volatile SingularAttribute<Unit, String> description;
    public static volatile SingularAttribute<Unit, Date> createdAt;
    public static volatile SingularAttribute<Unit, String> name;
    public static volatile SingularAttribute<Unit, WebUser> retirer;
    public static volatile SingularAttribute<Unit, Boolean> retired;
    public static volatile SingularAttribute<Unit, String> retireComments;
    public static volatile SingularAttribute<Unit, WebUser> creater;
    public static volatile SingularAttribute<Unit, Date> retiredAt;
    public static volatile SingularAttribute<Unit, Institution> institution;

}