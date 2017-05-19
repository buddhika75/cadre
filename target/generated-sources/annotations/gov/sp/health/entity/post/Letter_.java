package gov.sp.health.entity.post;

import gov.sp.health.entity.Category;
import gov.sp.health.entity.Institution;
import gov.sp.health.entity.Location;
import gov.sp.health.entity.Person;
import gov.sp.health.entity.Subject;
import gov.sp.health.entity.Unit;
import gov.sp.health.entity.WebUser;
import gov.sp.health.entity.post.Letter;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-30T01:56:22")
@StaticMetamodel(Letter.class)
public class Letter_ { 

    public static volatile SingularAttribute<Letter, Institution> toInstitution;
    public static volatile SingularAttribute<Letter, Person> fromPerson;
    public static volatile SingularAttribute<Letter, Subject> subject;
    public static volatile SingularAttribute<Letter, Boolean> retired;
    public static volatile SingularAttribute<Letter, Date> lettterDate;
    public static volatile SingularAttribute<Letter, WebUser> creater;
    public static volatile SingularAttribute<Letter, String> receiveComments;
    public static volatile SingularAttribute<Letter, Long> id;
    public static volatile SingularAttribute<Letter, String> letterContent;
    public static volatile SingularAttribute<Letter, Boolean> sent;
    public static volatile SingularAttribute<Letter, Date> sentTime;
    public static volatile SingularAttribute<Letter, Date> createdAt;
    public static volatile SingularAttribute<Letter, String> description;
    public static volatile SingularAttribute<Letter, Unit> fromUnit;
    public static volatile SingularAttribute<Letter, Letter> nextLetter;
    public static volatile SingularAttribute<Letter, WebUser> retirer;
    public static volatile SingularAttribute<Letter, String> name;
    public static volatile SingularAttribute<Letter, String> retireComments;
    public static volatile SingularAttribute<Letter, Person> toPerson;
    public static volatile SingularAttribute<Letter, Location> toLocation;
    public static volatile SingularAttribute<Letter, Letter> previousLetter;
    public static volatile SingularAttribute<Letter, Boolean> urgent;
    public static volatile SingularAttribute<Letter, Date> letterTime;
    public static volatile SingularAttribute<Letter, Location> fromLocation;
    public static volatile SingularAttribute<Letter, String> code;
    public static volatile SingularAttribute<Letter, Date> receivedDate;
    public static volatile SingularAttribute<Letter, Date> receivedTime;
    public static volatile SingularAttribute<Letter, Category> category;
    public static volatile SingularAttribute<Letter, Boolean> registered;
    public static volatile SingularAttribute<Letter, Unit> toUnit;
    public static volatile SingularAttribute<Letter, Date> sentDate;
    public static volatile SingularAttribute<Letter, String> sentComments;
    public static volatile SingularAttribute<Letter, String> letterComments;
    public static volatile SingularAttribute<Letter, Boolean> printed;
    public static volatile SingularAttribute<Letter, Boolean> secret;
    public static volatile SingularAttribute<Letter, Institution> fromInstitution;
    public static volatile SingularAttribute<Letter, Date> retiredAt;
    public static volatile SingularAttribute<Letter, byte[]> letterImage;

}