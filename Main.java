package com.morenets.ihor;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Student studentOne = new Student("Ihor", 23, 18, "male", 3.5, 234);
		Student studentTwo = new Student("Oleksii", 23, 18, "male", 3.5, 235);
		Student studentThree = new Student("Anton", 23, 18, "male", 3.5, 236);
		Student studentFour = new Student("Olha", 23, 18, "female", 3.5, 237);
		Student studentFive = new Student("Dariia", 23, 18, "female", 3.5, 238);
		Student studentSix = new Student("Michail", 23, 18, "male", 3.5, 239);
		Student studentSeven = new Student("Semen", 23, 18, "male", 3.5, 240);
		Student studentEight = new Student("Vitalii", 23, 18, "male", 3.5, 241);
		Student studentNine = new Student("Denys", 23, 18, "male", 3.5, 242);
		Student studentTen = new Student("Oleg", 23, 18, "male", 3.5, 243);
		Student studentEleven = new Student("John", 23, 18, "male", 3.5, 243);

		Student students[] = { studentOne, studentTwo, studentThree,
				studentFour, studentFive, studentSix, studentSeven,
				studentEight, studentNine, studentTen };

		Group groupOne = new Group();

		groupOne.setStudents(students);

		groupOne.addStudent("Ihor");
		groupOne.addStudent("Dariia");
		groupOne.addStudent("Oleksii");
		groupOne.addStudent("Anton");
		groupOne.addStudent("Olha");
		groupOne.addStudent("Michail");
		groupOne.addStudent("Semen");
		groupOne.addStudent("Vitalii");
		groupOne.addStudent("Denys");
		groupOne.addStudent("Oleg");
		// groupOne.addStudent("Oleg");
		// groupOne.addStudent("John");

		System.out.println(groupOne);
		


		try {

			for (int i = 0; i < groupOne.studentGroup.length; i++) {
				if (groupOne.studentGroup[groupOne.studentGroup.length - 1] != null)
					throw new MyException();

			}
		}

		catch (MyException e) {

			System.err.println(e.getMessage());
		}

		 groupOne.removeStudent("Ihor");
		 System.out.println(groupOne);

		groupOne.searchStudent("Dariia");

	}

}
