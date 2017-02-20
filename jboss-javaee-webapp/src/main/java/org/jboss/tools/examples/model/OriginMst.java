package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ORIGIN_MST database table.
 * 
 */
@Entity
@Table(name="ORIGIN_MST")
@NamedQuery(name="OriginMst.findAll", query="SELECT o FROM OriginMst o")
public class OriginMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OriginMstPK id;

	private String hirerarchy;

	private String note;

	@Column(name="ORIGIN_NAME")
	private String originName;

	public OriginMst() {
	}

	public OriginMstPK getId() {
		return this.id;
	}

	public void setId(OriginMstPK id) {
		this.id = id;
	}

	public String getHirerarchy() {
		return this.hirerarchy;
	}

	public void setHirerarchy(String hirerarchy) {
		this.hirerarchy = hirerarchy;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getOriginName() {
		return this.originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

}