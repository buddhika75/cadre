package gov.sp.health.entity;

import gov.sp.health.entity.QuestionerAnswer;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T03:42:24")
@StaticMetamodel(QuestionerAnswerItem.class)
public class QuestionerAnswerItem_ { 

    public static volatile SingularAttribute<QuestionerAnswerItem, Boolean> boolVal;
    public static volatile SingularAttribute<QuestionerAnswerItem, Date> dateVal;
    public static volatile SingularAttribute<QuestionerAnswerItem, Long> longVal;
    public static volatile SingularAttribute<QuestionerAnswerItem, String> shortTextVal;
    public static volatile SingularAttribute<QuestionerAnswerItem, QuestionerAnswer> questionerAnswer;
    public static volatile SingularAttribute<QuestionerAnswerItem, String> longTextVal;
    public static volatile SingularAttribute<QuestionerAnswerItem, Boolean> retired;
    public static volatile SingularAttribute<QuestionerAnswerItem, Double> doubleVal;
    public static volatile SingularAttribute<QuestionerAnswerItem, Integer> intVal;
    public static volatile SingularAttribute<QuestionerAnswerItem, WebUser> creater;
    public static volatile SingularAttribute<QuestionerAnswerItem, String> code;
    public static volatile SingularAttribute<QuestionerAnswerItem, Long> id;
    public static volatile SingularAttribute<QuestionerAnswerItem, String> description;
    public static volatile SingularAttribute<QuestionerAnswerItem, Date> createdAt;
    public static volatile SingularAttribute<QuestionerAnswerItem, String> name;
    public static volatile SingularAttribute<QuestionerAnswerItem, Date> timeVal;
    public static volatile SingularAttribute<QuestionerAnswerItem, WebUser> retirer;
    public static volatile SingularAttribute<QuestionerAnswerItem, String> retireComments;
    public static volatile SingularAttribute<QuestionerAnswerItem, Date> retiredAt;

}