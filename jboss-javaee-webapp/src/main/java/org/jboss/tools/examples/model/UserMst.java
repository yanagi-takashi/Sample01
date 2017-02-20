package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the USER_MST database table.
 * 
 */
@Entity
@Table(name="USER_MST")
@NamedQuery(name="UserMst.findAll", query="SELECT u FROM UserMst u")
public class UserMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private String userId;

	@Column(name="AUTH_METHOD")
	private String authMethod;

	@Temporal(TemporalType.DATE)
	@Column(name="AVAILABLE_END_DATE")
	private Date availableEndDate;

	@Column(name="AVAILABLE_FLG")
	private BigDecimal availableFlg;

	@Temporal(TemporalType.DATE)
	@Column(name="AVAILABLE_START_DATE")
	private Date availableStartDate;

	private String email;

	@Column(name="ORGIN_ID")
	private String orginId;

	private String password;

	@Column(name="USER_TYPE")
	private String userType;

	public UserMst() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAuthMethod() {
		return this.authMethod;
	}

	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
	}

	public Date getAvailableEndDate() {
		return this.availableEndDate;
	}

	public void setAvailableEndDate(Date availableEndDate) {
		this.availableEndDate = availableEndDate;
	}

	public BigDecimal getAvailableFlg() {
		return this.availableFlg;
	}

	public void setAvailableFlg(BigDecimal availableFlg) {
		this.availableFlg = availableFlg;
	}

	public Date getAvailableStartDate() {
		return this.availableStartDate;
	}

	public void setAvailableStartDate(Date availableStartDate) {
		this.availableStartDate = availableStartDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrginId() {
		return this.orginId;
	}

	public void setOrginId(String orginId) {
		this.orginId = orginId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}