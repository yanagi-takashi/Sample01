package org.jboss.tools.examples.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-02-17T18:14:44.534+0900")
@StaticMetamodel(UserMst.class)
public class UserMst_ {
	public static volatile SingularAttribute<UserMst, String> userId;
	public static volatile SingularAttribute<UserMst, String> authMethod;
	public static volatile SingularAttribute<UserMst, Date> availableEndDate;
	public static volatile SingularAttribute<UserMst, BigDecimal> availableFlg;
	public static volatile SingularAttribute<UserMst, Date> availableStartDate;
	public static volatile SingularAttribute<UserMst, String> email;
	public static volatile SingularAttribute<UserMst, String> orginId;
	public static volatile SingularAttribute<UserMst, String> password;
	public static volatile SingularAttribute<UserMst, String> userType;
}
