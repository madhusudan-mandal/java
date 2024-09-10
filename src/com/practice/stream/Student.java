package com.practice.stream;

import java.util.Objects;

public class Student implements Comparable {

	private String name;
	private int id;
	private int age;
	private float marks;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Student()
	{
		super();
	}
	
	Student(String name, int id, int age, float marks)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Float.floatToIntBits(marks) == Float.floatToIntBits(other.marks)
				&& Objects.equals(name, other.name);
	}
	
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Student s = (Student)obj;
		int length1 = this.getName().length();  
	    int length2 = s.getName().length();  
	    int limit = Math.min(length1, length2);  
	    char[] v1 = this.getName().toCharArray();  
	    char v2[] = s.getName().toCharArray();  
	   
	    int i = 0;  
	    if(this.getName().equals(s.getName()))
	    {
	    	return this.getId()-s.getId();
	    }
	    else
	    {
	    	while (i < limit) {  
		        char ch1 = v1[i];  
		        char ch2 = v2[i];  
		        if (ch1 != ch2) {  
		            return ch1 - ch2;  
		        }  
		        i++;  
	    	}
	    }
	    return length1 - length2;  
	}
	
	
	
}
