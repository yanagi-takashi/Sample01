package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the QUEST_ITEM_TBL database table.
 * 
 */
@Embeddable
public class QuestItemTblPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="QUEST_ID")
	private String questId;

	@Column(name="QUEST_ITEM_NO")
	private String questItemNo;

	public QuestItemTblPK() {
	}
	public String getQuestId() {
		return this.questId;
	}
	public void setQuestId(String questId) {
		this.questId = questId;
	}
	public String getQuestItemNo() {
		return this.questItemNo;
	}
	public void setQuestItemNo(String questItemNo) {
		this.questItemNo = questItemNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof QuestItemTblPK)) {
			return false;
		}
		QuestItemTblPK castOther = (QuestItemTblPK)other;
		return 
			this.questId.equals(castOther.questId)
			&& this.questItemNo.equals(castOther.questItemNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.questId.hashCode();
		hash = hash * prime + this.questItemNo.hashCode();
		
		return hash;
	}
}