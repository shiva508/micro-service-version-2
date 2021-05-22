package com.pool.model;

public class GlobelConfigModel {
	private String studentRollNumber;
	private String studentName;

	public GlobelConfigModel() {

	}

	public String getStudentRollNumber() {
		return studentRollNumber;
	}

	public GlobelConfigModel setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
		return this;
	}

	public String getStudentName() {
		return studentName;
	}

	public GlobelConfigModel setStudentName(String studentName) {
		this.studentName = studentName;
		return this;
	}

}
