package org.jboss.tools.examples.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the CODE_MST database table.
 *
 */
@Entity
@Table(name = "CODE_MST")
@NamedQuery(name = "CodeMst.findAll", query = "SELECT c FROM CodeMst c")
public class CodeMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CodeMstPK id;

	@Temporal(TemporalType.DATE)
	@Column(name = "AVAILABLE_END_DATE")
	private Date availableEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "AVAILABLE_START_DATE")
	private Date availableStartDate;

	@Column(name = "CODE_NAME")
	private String codeName;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_DATE")
	private Date createDate;

	@Column(name = "DEL_FLG")
	private BigDecimal delFlg;

	@Temporal(TemporalType.DATE)
	@Column(name = "UDPATE_DATE")
	private Date udpateDate;

	public CodeMst() {
	}

	public CodeMstPK getId() {
		return this.id;
	}

	public void setId(CodeMstPK id) {
		this.id = id;
	}

	public Date getAvailableEndDate() {
		return this.availableEndDate;
	}

	public void setAvailableEndDate(Date availableEndDate) {
		this.availableEndDate = availableEndDate;
	}

	public Date getAvailableStartDate() {
		return this.availableStartDate;
	}

	public void setAvailableStartDate(Date availableStartDate) {
		this.availableStartDate = availableStartDate;
	}

	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	// public BigDecimal getDelFlg() {
	public String getDelFlg() {
		if (this.delFlg != null && this.delFlg.intValue() == 1) {
			return "×";
		} else {
			return "○";
		}
	}

	public void setDelFlg(BigDecimal delFlg) {
		this.delFlg = delFlg;
	}

	public Date getUdpateDate() {
		return this.udpateDate;
	}

	public void setUdpateDate(Date udpateDate) {
		this.udpateDate = udpateDate;
	}

}