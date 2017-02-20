package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ORIGIN_MST database table.
 * 
 */
@Embeddable
public class OriginMstPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CATEGORY_ID")
	private String categoryId;

	@Column(name="ORIGIN_ID")
	private String originId;

	public OriginMstPK() {
	}
	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getOriginId() {
		return this.originId;
	}
	public void setOriginId(String originId) {
		this.originId = originId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OriginMstPK)) {
			return false;
		}
		OriginMstPK castOther = (OriginMstPK)other;
		return 
			this.categoryId.equals(castOther.categoryId)
			&& this.originId.equals(castOther.originId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.categoryId.hashCode();
		hash = hash * prime + this.originId.hashCode();
		
		return hash;
	}
}