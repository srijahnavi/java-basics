package objectclass;

import objectclass.util;

public class student {
	String name;
	int age;
	
	/**
	 * default constructor-- Sri jahnavi
	 * @param string
	 */
	public student() {}
	/**
	 * shiny constructor
	 * @return
	 */
	public student(String name) {
		this.name=name;
	}
	/**
	 * Nagu constructor
	 * @param name
	 * @param age
	 */
	
	public student (String name,int age) {
		super();
		this.name=name;
		this.age=+2;
		this.age=
   util.incrementByTen(age); 
	}
	static String COLLEGE_Name="NIT";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}

}
