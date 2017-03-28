package gov.sp.health.entity;

import gov.sp.health.data.EntryDataType;
import gov.sp.health.entity.Questioner;
import gov.sp.health.entity.QuestionerItem;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T02:58:01")
@StaticMetamodel(QuestionerItem.class)
public class QuestionerItem_ { 

    public static volatile SingularAttribute<QuestionerItem, Long> id;
    public static volatile SingularAttribute<QuestionerItem, Questioner> questioner;
    public static volatile SingularAttribute<QuestionerItem, Date> createdAt;
    public static volatile SingularAttribute<QuestionerItem, String> description;
    public static volatile SingularAttribute<QuestionerItem, WebUser> retirer;
    public static volatile SingularAttribute<QuestionerItem, String> name;
    public static volatile SingularAttribute<QuestionerItem, String> retireComments;
    public static volatile SingularAttribute<QuestionerItem, Boolean> retired;
    public static volatile SingularAttribute<QuestionerItem, EntryDataType> entryDataType;
    public static volatile SingularAttribute<QuestionerItem, WebUser> creater;
    public static volatile SingularAttribute<QuestionerItem, String> code;
    public static volatile SingularAttribute<QuestionerItem, Date> retiredAt;
    public static volatile SingularAttribute<QuestionerItem, QuestionerItem> superItem;

}