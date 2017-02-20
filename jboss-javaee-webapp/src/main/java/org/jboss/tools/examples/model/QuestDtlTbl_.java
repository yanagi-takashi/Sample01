package org.jboss.tools.examples.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-02-17T19:34:05.347+0900")
@StaticMetamodel(QuestDtlTbl.class)
public class QuestDtlTbl_ {
	public static volatile SingularAttribute<QuestDtlTbl, QuestDtlTblPK> id;
	public static volatile SingularAttribute<QuestDtlTbl, BigDecimal> dispNo;
	public static volatile SingularAttribute<QuestDtlTbl, String> questDtlNote;
}
