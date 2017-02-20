package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the QUEST_TBL database table.
 * 
 */
@Entity
@Table(name="QUEST_TBL")
@NamedQuery(name="QuestTbl.findAll", query="SELECT q FROM QuestTbl q")
public class QuestTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="QUEST_ID")
	private String questId;

	@Column(name="OPENER_ID")
	private String openerId;

	@Temporal(TemporalType.DATE)
	@Column(name="PERIOD_END_DATE")
	private Date periodEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PERIOD_START_DATE")
	private Date periodStartDate;

	@Column(name="QUEST_CATEGORY_ID")
	private String questCategoryId;

	@Temporal(TemporalType.DATE)
	@Column(name="QUEST_EXCEPT_DATE")
	private Date questExceptDate;

	@Temporal(TemporalType.DATE)
	@Column(name="QUEST_LIMIT_DATE")
	private Date questLimitDate;

	@Column(name="QUEST_NOTE")
	private String questNote;

	@Temporal(TemporalType.DATE)
	@Column(name="QUEST_START_DATE")
	private Date questStartDate;

	@Column(name="QUEST_TITLE")
	private String questTitle;

	@Column(name="REVIEWER_ID")
	private String reviewerId;

	private String status;

	public QuestTbl() {
	}

	public String getQuestId() {
		return this.questId;
	}

	public void setQuestId(String questId) {
		this.questId = questId;
	}

	public String getOpenerId() {
		return this.openerId;
	}

	public void setOpenerId(String openerId) {
		this.openerId = openerId;
	}

	public Date getPeriodEndDate() {
		return this.periodEndDate;
	}

	public void setPeriodEndDate(Date periodEndDate) {
		this.periodEndDate = periodEndDate;
	}

	public Date getPeriodStartDate() {
		return this.periodStartDate;
	}

	public void setPeriodStartDate(Date periodStartDate) {
		this.periodStartDate = periodStartDate;
	}

	public String getQuestCategoryId() {
		return this.questCategoryId;
	}

	public void setQuestCategoryId(String questCategoryId) {
		this.questCategoryId = questCategoryId;
	}

	public Date getQuestExceptDate() {
		return this.questExceptDate;
	}

	public void setQuestExceptDate(Date questExceptDate) {
		this.questExceptDate = questExceptDate;
	}

	public Date getQuestLimitDate() {
		return this.questLimitDate;
	}

	public void setQuestLimitDate(Date questLimitDate) {
		this.questLimitDate = questLimitDate;
	}

	public String getQuestNote() {
		return this.questNote;
	}

	public void setQuestNote(String questNote) {
		this.questNote = questNote;
	}

	public Date getQuestStartDate() {
		return this.questStartDate;
	}

	public void setQuestStartDate(Date questStartDate) {
		this.questStartDate = questStartDate;
	}

	public String getQuestTitle() {
		return this.questTitle;
	}

	public void setQuestTitle(String questTitle) {
		this.questTitle = questTitle;
	}

	public String getReviewerId() {
		return this.reviewerId;
	}

	public void setReviewerId(String reviewerId) {
		this.reviewerId = reviewerId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}