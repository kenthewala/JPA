package com.gurukul.java;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Subject
 *
 */
@Entity

public class Subject implements Serializable {

	@Id
	private int id;
	private String name;
	private String comments;

	@ManyToMany(mappedBy="availableSubjects")
	private List<Centre> centre;
	
	private static final long serialVersionUID = 1L;

	public Subject() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<Centre> getCentre() {
		return centre;
	}

	public void setCentre(List<Centre> centre) {
		this.centre = centre;
	}
   
}
