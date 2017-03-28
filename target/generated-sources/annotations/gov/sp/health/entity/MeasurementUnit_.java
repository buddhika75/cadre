package gov.sp.health.entity;

import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T02:58:01")
@StaticMetamodel(MeasurementUnit.class)
public class MeasurementUnit_ { 

    public static volatile SingularAttribute<MeasurementUnit, Long> id;
    public static volatile SingularAttribute<MeasurementUnit, String> description;
    public static volatile SingularAttribute<MeasurementUnit, Date> createdAt;
    public static volatile SingularAttribute<MeasurementUnit, String> name;
    public static volatile SingularAttribute<MeasurementUnit, WebUser> retirer;
    public static volatile SingularAttribute<MeasurementUnit, Boolean> retired;
    public static volatile SingularAttribute<MeasurementUnit, String> retireComments;
    public static volatile SingularAttribute<MeasurementUnit, WebUser> creater;
    public static volatile SingularAttribute<MeasurementUnit, String> code;
    public static volatile SingularAttribute<MeasurementUnit, Date> retiredAt;

}