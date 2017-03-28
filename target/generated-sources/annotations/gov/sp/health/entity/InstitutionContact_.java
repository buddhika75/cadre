package gov.sp.health.entity;

import gov.sp.health.entity.ContactType;
import gov.sp.health.entity.Institution;
import gov.sp.health.entity.WebUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T04:31:11")
@StaticMetamodel(InstitutionContact.class)
public class InstitutionContact_ { 

    public static volatile SingularAttribute<InstitutionContact, Long> id;
    public static volatile SingularAttribute<InstitutionContact, Date> createdAt;
    public static volatile SingularAttribute<InstitutionContact, String> description;
    public static volatile SingularAttribute<InstitutionContact, WebUser> retirer;
    public static volatile SingularAttribute<InstitutionContact, String> name;
    public static volatile SingularAttribute<InstitutionContact, String> retireComments;
    public static volatile SingularAttribute<InstitutionContact, String> tname;
    public static volatile SingularAttribute<InstitutionContact, Boolean> retired;
    public static volatile SingularAttribute<InstitutionContact, ContactType> contactType;
    public static volatile SingularAttribute<InstitutionContact, WebUser> creater;
    public static volatile SingularAttribute<InstitutionContact, Date> retiredAt;
    public static volatile SingularAttribute<InstitutionContact, String> sname;
    public static volatile SingularAttribute<InstitutionContact, Institution> institution;

}