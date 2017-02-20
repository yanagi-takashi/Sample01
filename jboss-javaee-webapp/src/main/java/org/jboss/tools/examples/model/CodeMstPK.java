package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CODE_MST database table.
 * 
 */
@Embeddable
public class CodeMstPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CODE_TYPE")
	private String codeType;

	@Column(name="CODE_ID")
	private String codeId;

	public CodeMstPK() {
	}
	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	public String getCodeId() {
		return this.codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CodeMstPK)) {
			return false;
		}
		CodeMstPK castOther = (CodeMstPK)other;
		return 
			this.codeType.equals(castOther.codeType)
			&& this.codeId.equals(castOther.codeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeType.hashCode();
		hash = hash * prime + this.codeId.hashCode();
		
		return hash;
	}
}