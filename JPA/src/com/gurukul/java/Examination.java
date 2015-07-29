package com.gurukul.java;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Examination
 *
 */
@Entity

public class Examination implements Serializable {

	@Id
	private int id;
	private String name;
	
	@ManyToMany(mappedBy="examinations")
	private List<Centre> centre;
	private int maxMarks;
	
	@ManyToMany
	@JoinTable(name="exam_question",
	joinColumns=@JoinColumn(name="exam_id"),
	inverseJoinColumns=@JoinColumn(name="question_id"))
	private List<Question> questions;
	
	private Timestamp timestamp;
	
	private static final long serialVersionUID = 1L;

	public Examination() {
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

	public List<Centre> getCentre() {
		return centre;
	}

	public void setCentre(List<Centre> centre) {
		this.centre = centre;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
   
}
