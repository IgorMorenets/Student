package com.morenets.ihor;

import java.util.Arrays;

public class Group {

	private Student studentOne;
	private Student studentTwo;
	private Student studentThree;
	private Student studentFour;
	private Student studentFive;
	private Student studentSix;
	private Student studentSeven;
	private Student studentEight;
	private Student studentNine;
	private Student studentTen;

	Student students[] = { studentOne, studentTwo, studentThree, studentFour,
			studentFive, studentSix, studentSeven, studentEight, studentNine,
			studentTen };

	Student studentGroup[] = { studentOne, studentTwo, studentThree,
			studentFour, studentFive, studentSix, studentSeven, studentEight,
			studentNine, studentTen };

	public Group() {
		super();
	}

	public Student getStudentOne() {
		return studentOne;
	}

	public void setStudentOne(Student studentOne) {
		this.studentOne = studentOne;
	}

	public Student getStudentTwo() {
		return studentTwo;
	}

	public void setStudentTwo(Student studentTwo) {
		this.studentTwo = studentTwo;
	}

	public Student getStudentThree() {
		return studentThree;
	}

	public void setStudentThree(Student studentThree) {
		this.studentThree = studentThree;
	}

	public Student getStudentFour() {
		return studentFour;
	}

	public void setStudentFour(Student studentFour) {
		this.studentFour = studentFour;
	}

	public Student getStudentFive() {
		return studentFive;
	}

	public void setStudentFive(Student studentFive) {
		this.studentFive = studentFive;
	}

	public Student getStudentSix() {
		return studentSix;
	}

	public void setStudentSix(Student studentSix) {
		this.studentSix = studentSix;
	}

	public Student getStudentSeven() {
		return studentSeven;
	}

	public void setStudentSeven(Student studentSeven) {
		this.studentSeven = studentSeven;
	}

	public Student getStudentEight() {
		return studentEight;
	}

	public void setStudentEight(Student studentEight) {
		this.studentEight = studentEight;
	}

	public Student getStudentNine() {
		return studentNine;
	}

	public void setStudentNine(Student studentNine) {
		this.studentNine = studentNine;
	}

	public Student getStudentTen() {
		return studentTen;
	}

	public void setStudentTen(Student studentTen) {
		this.studentTen = studentTen;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Student[] getStudentGroup() {
		return studentGroup;
	}

	public void setStudentGroup(Student[] studentGroup) {
		this.studentGroup = studentGroup;
	}

	void addStudent(String name) {

		for (int i = 0; i < students.length; i++) {
			if (students[i].getName() == name) {

				for (int j = 0; j < studentGroup.length; j++) {
					if (studentGroup[j] == null) {
						studentGroup[j] = students[i];
						break;
					}

					if (studentGroup[j] == students[i]) {
						System.out
								.println("Student " + name + " already added");
						break;
					}

				}

			}
		}

	}

	void removeStudent(String name) {

		for (int j = 0; j < studentGroup.length; j++) {

			if (studentGroup[j].getName() == name) {

				studentGroup[j] = null;
				break;
			}

		}

	}

	void searchStudent(String name) {

		for (int j = 0; j < students.length; j++) {

			if (students[j].getName().equals(name)) {

				for (int i = 0; i < studentGroup.length; i++) {
					if (students[j] == studentGroup[i]) {
						System.out.println(studentGroup[i]);
						break;
					}

				}

			}

		}

	}

	@Override
	public String toString() {
		return "Group [studentGroup=" + Arrays.toString(studentGroup) + "]";
	}
}
