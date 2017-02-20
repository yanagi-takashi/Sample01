package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the QUEST_DTL_TBL database table.
 * 
 */
@Entity
@Table(name="QUEST_DTL_TBL")
@NamedQuery(name="QuestDtlTbl.findAll", query="SELECT q FROM QuestDtlTbl q")
public class QuestDtlTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuestDtlTblPK id;

	@Column(name="DISP_NO")
	private BigDecimal dispNo;

	@Column(name="QUEST_DTL_NOTE")
	private String questDtlNote;

	public QuestDtlTbl() {
	}

	public QuestDtlTblPK getId() {
		return this.id;
	}

	public void setId(QuestDtlTblPK id) {
		this.id = id;
	}

	public BigDecimal getDispNo() {
		return this.dispNo;
	}

	public void setDispNo(BigDecimal dispNo) {
		this.dispNo = dispNo;
	}

	public String getQuestDtlNote() {
		return this.questDtlNote;
	}

	public void setQuestDtlNote(String questDtlNote) {
		this.questDtlNote = questDtlNote;
	}

}