package com.gurukul.java;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Centre
 *
 */
@Entity
public class Centre implements Serializable {

	@Id
	private int id;
	private String name;
	private String address;
	
	@JoinTable(name="centre_examination",
			joinColumns=@JoinColumn(name="centre_id"),
			inverseJoinColumns=@JoinColumn(name="exam_id"))
	private List<Examination> examinations;

	@ManyToMany
	@JoinTable(name = "centre_subjects", 
	joinColumns = @JoinColumn(name = "centre_id"), 
	inverseJoinColumns = @JoinColumn(name = "subject_id"))
	private List<Subject> availableSubjects;

	@OneToOne
	@JoinColumn(name = "centreHead_id")
	private CentreHead centreHead;

	@OneToMany(mappedBy = "centre", targetEntity = Student.class)
	private List<Student> students;
	private static final long serialVersionUID = 1L;

	public Centre() {
		super();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CentreHead getCentreHead() {
		return centreHead;
	}

	public void setCentreHead(CentreHead centreHead) {
		this.centreHead = centreHead;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Subject> getAvailableSubjects() {
		return availableSubjects;
	}

	public void setAvailableSubjects(List<Subject> availableSubjects) {
		this.availableSubjects = availableSubjects;
	}

	public List<Examination> getExaminations() {
		return examinations;
	}

	public void setExaminations(List<Examination> examinations) {
		this.examinations = examinations;
	}

}
