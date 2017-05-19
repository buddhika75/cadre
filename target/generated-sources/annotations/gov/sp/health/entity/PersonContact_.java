package gov.sp.health.entity;

import gov.sp.health.entity.ContactType;
import gov.sp.health.entity.Person;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-30T01:56:22")
@StaticMetamodel(PersonContact.class)
public class PersonContact_ { 

    public static volatile SingularAttribute<PersonContact, Person> person;
    public static volatile SingularAttribute<PersonContact, Boolean> retired;
    public static volatile SingularAttribute<PersonContact, WebUser> creater;
    public static volatile SingularAttribute<PersonContact, String> sname;
    public static volatile SingularAttribute<PersonContact, Long> id;
    public static volatile SingularAttribute<PersonContact, String> description;
    public static volatile SingularAttribute<PersonContact, Date> createdAt;
    public static volatile SingularAttribute<PersonContact, String> name;
    public static volatile SingularAttribute<PersonContact, WebUser> retirer;
    public static volatile SingularAttribute<PersonContact, String> tname;
    public static volatile SingularAttribute<PersonContact, String> retireComments;
    public static volatile SingularAttribute<PersonContact, ContactType> contactType;
    public static volatile SingularAttribute<PersonContact, Date> retiredAt;

}