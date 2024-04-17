package com.tns.daythree;

public class Encapsulation_Demo {
	
	private String name;
	private int age;
	private int runs;
	
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
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	@Override
	public String toString() {
		return "Team name:[Name="+name+",Age="+age+",Runs="+runs+"]";
	}

	
	public static void main(String[] args) {
		Encapsulation_Demo obj=new Encapsulation_Demo();
		obj.setName("mani");
		obj.setAge(20);;
		obj.setRuns(264);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj);
	}

}
