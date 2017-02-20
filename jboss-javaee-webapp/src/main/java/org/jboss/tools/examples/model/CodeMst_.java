package org.jboss.tools.examples.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-02-17T18:14:44.310+0900")
@StaticMetamodel(CodeMst.class)
public class CodeMst_ {
	public static volatile SingularAttribute<CodeMst, CodeMstPK> id;
	public static volatile SingularAttribute<CodeMst, Date> availableEndDate;
	public static volatile SingularAttribute<CodeMst, Date> availableStartDate;
	public static volatile SingularAttribute<CodeMst, String> codeName;
	public static volatile SingularAttribute<CodeMst, Date> createDate;
	public static volatile SingularAttribute<CodeMst, BigDecimal> delFlg;
	public static volatile SingularAttribute<CodeMst, Date> udpateDate;
}
