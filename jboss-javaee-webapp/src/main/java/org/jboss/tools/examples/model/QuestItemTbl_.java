package org.jboss.tools.examples.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-02-17T19:34:05.359+0900")
@StaticMetamodel(QuestItemTbl.class)
public class QuestItemTbl_ {
	public static volatile SingularAttribute<QuestItemTbl, QuestItemTblPK> id;
	public static volatile SingularAttribute<QuestItemTbl, Date> commentCreateDate;
	public static volatile SingularAttribute<QuestItemTbl, String> commentNote;
	public static volatile SingularAttribute<QuestItemTbl, Date> commentUpdateDate;
	public static volatile SingularAttribute<QuestItemTbl, String> commentUserId;
	public static volatile SingularAttribute<QuestItemTbl, BigDecimal> delFlg;
}
