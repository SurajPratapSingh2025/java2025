package com.encap;

import java.util.Scanner;

public class Student {
	private int roll;
	private int age;
	private char gender;
	private String pc;
	private float pcmPer;
	
	public void setData(int roll,int age,char gender,String pc,float pcmPer){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Key: ");
		int key=scanner.nextInt();
		if(key==12345) {
			this.roll=roll;
			this.age=age;
			this.gender=gender;
			this.pc=pc;
			this.pcmPer=pcmPer;
		}
		else {
			System.out.println("Unauthorised User");
		}
	}
	public void printData() {
		
		System.out.println("Roll= "+roll);
		System.out.println("Age= "+age);
		System.out.println("Gender= "+gender);
		System.out.println("Physcial C.= "+pc);
		System.out.println("Percentage= "+pcmPer);
	}
}
