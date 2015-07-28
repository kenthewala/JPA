package com.gurukul.java;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Examination
 *
 */
@Entity

public class Examination implements Serializable {

	@Id
	private int id;
	private String name;
	private List<Centre> centre;
	private int maxMarks;
	private List<Question> questions;
	private Timestamp timestamp;
	
	private static final long serialVersionUID = 1L;

	public Examination() {
		super();
	}
	
   
}
