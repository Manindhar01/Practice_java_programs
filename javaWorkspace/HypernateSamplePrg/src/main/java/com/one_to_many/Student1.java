package com.one_to_many;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Student1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stdId;
	private String name;
	private int std;
	@OneToMany  
	private List<Library> books;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public List<Library> getLibrary() {
		return books;
	}
	public void setLibrary(List<Library> library) {
		this.books = library;
	}
	

}
