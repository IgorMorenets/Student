package com.morenets.ihor;

public class Student extends Human {
	private double gpa;
	private long recordbookNum;
	

	public Student(String name, double weight, int age, String sex, double gpa,
			long recordbookNum) {
		super(name, weight, age, sex);
		this.gpa = gpa;
		this.recordbookNum = recordbookNum;
	}
	
	

	public Student() {
		super();
	}



	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public long getRecordbookNum() {
		return recordbookNum;
	}

	public void setRecordbookNum(long recordbookNum) {
		this.recordbookNum = recordbookNum;
	}



	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", recordbookNum=" + recordbookNum
				+ super.toString();
	}


}
