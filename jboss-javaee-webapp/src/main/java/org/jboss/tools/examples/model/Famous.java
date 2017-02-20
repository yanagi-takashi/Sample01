package org.jboss.tools.examples.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FAMOUS database table.
 * 
 */
@Entity
@NamedQuery(name="Famous.findAll", query="SELECT f FROM Famous f")
public class Famous implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"NO\"")
	private long no;

	private String job;

	private String name;

	private String schoolname;

	public Famous() {
	}

	public long getNo() {
		return this.no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolname() {
		return this.schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

}