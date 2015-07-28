package com.gurukul.java;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity

public class Question implements Serializable {

	@Id
	private int id;
	private int questionText;
	
	private List<Answer> choices;
	
	@OneToMany
	@JoinColumn(name="subject_id")
	private Subject subject;
	
	private static final long serialVersionUID = 1L;

	public Question() {
		super();
	}
   
}
