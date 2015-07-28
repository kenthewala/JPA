package com.gurukul.java;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Answer
 *
 */
@Entity

public class Answer implements Serializable {

	@Id
	private int id;
	private int answerText;
	
	//TODO: Image Support is also to be given.
	
	private static final long serialVersionUID = 1L;

	public Answer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnswerText() {
		return answerText;
	}

	public void setAnswerText(int answerText) {
		this.answerText = answerText;
	}
   
}
