package org.toolbox.TaskForMe.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseModel implements Serializable {

	private boolean isActive = Boolean.TRUE;
	
	@Column(columnDefinition = "timestamp with time zone")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;
	
	@Column(columnDefinition = "timestamp with time zone")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedOn;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
}
