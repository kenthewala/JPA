package com.gurukul.java;

import java.io.Serializable;
import javax.persistence.*;

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
   
}
