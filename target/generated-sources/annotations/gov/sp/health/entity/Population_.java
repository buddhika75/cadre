package gov.sp.health.entity;

import gov.sp.health.entity.Area;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:17:48")
@StaticMetamodel(Population.class)
public class Population_ { 

    public static volatile SingularAttribute<Population, Long> id;
    public static volatile SingularAttribute<Population, Area> area;
    public static volatile SingularAttribute<Population, Long> populationNumber;
    public static volatile SingularAttribute<Population, Date> createdAt;
    public static volatile SingularAttribute<Population, String> description;
    public static volatile SingularAttribute<Population, Long> estimatedPopulation;
    public static volatile SingularAttribute<Population, WebUser> retirer;
    public static volatile SingularAttribute<Population, String> name;
    public static volatile SingularAttribute<Population, String> retireComments;
    public static volatile SingularAttribute<Population, Boolean> retired;
    public static volatile SingularAttribute<Population, WebUser> creater;
    public static volatile SingularAttribute<Population, Date> retiredAt;
    public static volatile SingularAttribute<Population, Double> areaKm;

}