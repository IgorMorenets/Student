package com.morenets.ihor;

public class Human {

	private String name;
	private double weight;
	private int age;
	private String sex;

	public Human(String name, double weight, int age, String sex) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", weight=" + weight + ", age=" + age
				+ ", sex=" + sex + "]";
	}

}
