package org.jboss.tools.examples.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-02-17T19:15:04.801+0900")
@StaticMetamodel(QuestTbl.class)
public class QuestTbl_ {
	public static volatile SingularAttribute<QuestTbl, String> questId;
	public static volatile SingularAttribute<QuestTbl, String> openerId;
	public static volatile SingularAttribute<QuestTbl, Date> periodEndDate;
	public static volatile SingularAttribute<QuestTbl, Date> periodStartDate;
	public static volatile SingularAttribute<QuestTbl, String> questCategoryId;
	public static volatile SingularAttribute<QuestTbl, Date> questExceptDate;
	public static volatile SingularAttribute<QuestTbl, Date> questLimitDate;
	public static volatile SingularAttribute<QuestTbl, String> questNote;
	public static volatile SingularAttribute<QuestTbl, Date> questStartDate;
	public static volatile SingularAttribute<QuestTbl, String> questTitle;
	public static volatile SingularAttribute<QuestTbl, String> reviewerId;
	public static volatile SingularAttribute<QuestTbl, String> status;
}
