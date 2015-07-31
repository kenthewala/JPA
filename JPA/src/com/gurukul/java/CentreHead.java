package com.gurukul.java;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: CentreHead
 *
 */
@Entity
public class CentreHead implements Serializable {

	@Id
	private int id;
	private String name;
	private String fName;
	
	@Embedded
	private Address address;
	private Integer contactNumber;
	
	@OneToOne(mappedBy="centreHead")
	private Centre centre;
	
	private static final long serialVersionUID = 1L;

	public CentreHead() {
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

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Centre getCentre() {
		return centre;
	}

	public void setCentre(Centre centre) {
		this.centre = centre;
	}

}
