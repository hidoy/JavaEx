package com.javaex.oop.person.v1;

public class Student extends Person{
	private String schoolName;
	
	public Student(String schoolName) {
		this.schoolName=schoolName;
	}
	
	public Student(String name,int age,String schoolName) {
		super(name,age);
		this.schoolName=schoolName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName=schoolName;
	}
	@Override
	public void showInfo() {
		System.out.printf("이름은 %s 이고 나이는 %d 이고 다니는 학교는 %s입니다 %n",super.getName(),super.getAge(),schoolName);
	}
}
