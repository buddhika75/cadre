package gov.sp.health.entity;

import gov.sp.health.entity.Questioner;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T02:58:01")
@StaticMetamodel(QuestionerAnswer.class)
public class QuestionerAnswer_ { 

    public static volatile SingularAttribute<QuestionerAnswer, Long> id;
    public static volatile SingularAttribute<QuestionerAnswer, Questioner> questioner;
    public static volatile SingularAttribute<QuestionerAnswer, String> description;
    public static volatile SingularAttribute<QuestionerAnswer, Date> createdAt;
    public static volatile SingularAttribute<QuestionerAnswer, String> name;
    public static volatile SingularAttribute<QuestionerAnswer, WebUser> retirer;
    public static volatile SingularAttribute<QuestionerAnswer, Boolean> retired;
    public static volatile SingularAttribute<QuestionerAnswer, String> retireComments;
    public static volatile SingularAttribute<QuestionerAnswer, WebUser> creater;
    public static volatile SingularAttribute<QuestionerAnswer, String> code;
    public static volatile SingularAttribute<QuestionerAnswer, Date> retiredAt;

}