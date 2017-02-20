package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the QUEST_DTL_TBL database table.
 * 
 */
@Embeddable
public class QuestDtlTblPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="QUEST_ID")
	private String questId;

	@Column(name="QUEST_DTL_ID")
	private String questDtlId;

	public QuestDtlTblPK() {
	}
	public String getQuestId() {
		return this.questId;
	}
	public void setQuestId(String questId) {
		this.questId = questId;
	}
	public String getQuestDtlId() {
		return this.questDtlId;
	}
	public void setQuestDtlId(String questDtlId) {
		this.questDtlId = questDtlId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof QuestDtlTblPK)) {
			return false;
		}
		QuestDtlTblPK castOther = (QuestDtlTblPK)other;
		return 
			this.questId.equals(castOther.questId)
			&& this.questDtlId.equals(castOther.questDtlId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.questId.hashCode();
		hash = hash * prime + this.questDtlId.hashCode();
		
		return hash;
	}
}