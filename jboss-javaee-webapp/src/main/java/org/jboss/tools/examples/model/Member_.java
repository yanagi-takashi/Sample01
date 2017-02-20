package org.jboss.tools.examples.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-02-17T19:29:56.941+0900")
@StaticMetamodel(Member.class)
public class Member_ {
	public static volatile SingularAttribute<Member, Long> id;
	public static volatile SingularAttribute<Member, String> email;
	public static volatile SingularAttribute<Member, String> name;
	public static volatile SingularAttribute<Member, String> phoneNumber;
}
