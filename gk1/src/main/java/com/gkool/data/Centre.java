package com.gkool.data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Centre
 *
 */
@Entity
public class Centre implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	private int id;

	public Centre() {
		super();
	}
   
}
