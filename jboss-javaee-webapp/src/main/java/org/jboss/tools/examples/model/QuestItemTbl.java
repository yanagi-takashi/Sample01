package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the QUEST_ITEM_TBL database table.
 * 
 */
@Entity
@Table(name="QUEST_ITEM_TBL")
@NamedQuery(name="QuestItemTbl.findAll", query="SELECT q FROM QuestItemTbl q")
public class QuestItemTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuestItemTblPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="COMMENT_CREATE_DATE")
	private Date commentCreateDate;

	@Column(name="COMMENT_NOTE")
	private String commentNote;

	@Temporal(TemporalType.DATE)
	@Column(name="COMMENT_UPDATE_DATE")
	private Date commentUpdateDate;

	@Column(name="COMMENT_USER_ID")
	private String commentUserId;

	@Column(name="DEL_FLG")
	private BigDecimal delFlg;

	public QuestItemTbl() {
	}

	public QuestItemTblPK getId() {
		return this.id;
	}

	public void setId(QuestItemTblPK id) {
		this.id = id;
	}

	public Date getCommentCreateDate() {
		return this.commentCreateDate;
	}

	public void setCommentCreateDate(Date commentCreateDate) {
		this.commentCreateDate = commentCreateDate;
	}

	public String getCommentNote() {
		return this.commentNote;
	}

	public void setCommentNote(String commentNote) {
		this.commentNote = commentNote;
	}

	public Date getCommentUpdateDate() {
		return this.commentUpdateDate;
	}

	public void setCommentUpdateDate(Date commentUpdateDate) {
		this.commentUpdateDate = commentUpdateDate;
	}

	public String getCommentUserId() {
		return this.commentUserId;
	}

	public void setCommentUserId(String commentUserId) {
		this.commentUserId = commentUserId;
	}

	public BigDecimal getDelFlg() {
		return this.delFlg;
	}

	public void setDelFlg(BigDecimal delFlg) {
		this.delFlg = delFlg;
	}

}