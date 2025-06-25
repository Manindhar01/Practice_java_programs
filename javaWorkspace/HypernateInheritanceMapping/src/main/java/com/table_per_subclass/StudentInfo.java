package com.table_per_subclass;

import jakarta.persistence.*;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class StudentInfo {
	@Id
	private int id;
	private String name;
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
	

}
