package com.gurukul.java;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity

public class Question implements Serializable {

	@Id
	private int id;
	private int questionText;
	
	@OneToMany
	@JoinTable(name="question_choices",
	joinColumns=@JoinColumn(name="question_id"),
	inverseJoinColumns=@JoinColumn(name="answer_choice")
	)
	private List<Answer> choices;
	
	@OneToOne
	@JoinColumn(name="correctAnswer_id")
	private Answer correctAnswer;
	
	@OneToOne
	@JoinColumn(name="subject_id")
	private Subject subject;
	
	@ManyToMany(mappedBy="questions")
	private List<Examination> examinations;
	
	private static final long serialVersionUID = 1L;

	public Question() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuestionText() {
		return questionText;
	}

	public void setQuestionText(int questionText) {
		this.questionText = questionText;
	}

	public List<Answer> getChoices() {
		return choices;
	}

	public void setChoices(List<Answer> choices) {
		this.choices = choices;
	}

	public Answer getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Answer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<Examination> getExaminations() {
		return examinations;
	}

	public void setExaminations(List<Examination> examinations) {
		this.examinations = examinations;
	}
   
}
