package com.dps.qlarius.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A News entry for the site.
 * @author Dan Developer
 */
@Entity
public class News implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "news_id")
	private Long id;

	@NotEmpty(message = "A news title must be provided.")
	private String title;

	@NotEmpty(message = "A news content must be provided.")
	private String content;

	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date startDate;

	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date endDate;

	private boolean active;

	public News() {
		Calendar calendar = Calendar.getInstance();
		setStartDate(calendar.getTime());
		setActive(true);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Basic
	@Temporal(TemporalType.DATE)
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date datetime) {
		this.startDate = datetime;
	}
	
	@Basic
	@Temporal(TemporalType.DATE)
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "News(" + title + "," + startDate + "," + content + ")";
	}

}
