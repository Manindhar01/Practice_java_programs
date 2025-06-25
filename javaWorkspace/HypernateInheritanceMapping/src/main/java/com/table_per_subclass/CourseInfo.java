package com.table_per_subclass;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class CourseInfo extends StudentInfo {
	private String courseName;
	private String duration;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

}
