package gov.sp.health.entity;

import gov.sp.health.entity.Category;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T02:58:01")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Category> parentCategory;
    public static volatile SingularAttribute<Category, Boolean> retired;
    public static volatile SingularAttribute<Category, WebUser> creater;
    public static volatile SingularAttribute<Category, String> code;
    public static volatile SingularAttribute<Category, String> sname;
    public static volatile SingularAttribute<Category, Long> id;
    public static volatile SingularAttribute<Category, Double> dblValue;
    public static volatile SingularAttribute<Category, Integer> orderNo;
    public static volatile SingularAttribute<Category, Long> longValue;
    public static volatile SingularAttribute<Category, String> description;
    public static volatile SingularAttribute<Category, Date> createdAt;
    public static volatile SingularAttribute<Category, WebUser> retirer;
    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, String> retireComments;
    public static volatile SingularAttribute<Category, String> tname;
    public static volatile SingularAttribute<Category, Date> retiredAt;

}