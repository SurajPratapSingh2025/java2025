package com.encap;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No: ");
		 int roll=sc.nextInt();
		System.out.println("Enter Age: ");
		 int age=sc.nextInt();
		System.out.println("Enter Gender: ");
		 char gender=sc.next().charAt(0);
		System.out.println("Enter Physically Challenged: ");
		 String pc=sc.next();
		System.out.println("Enter Percentage: ");
		 float pcmPer=sc.nextFloat();
		
		Car car=new Car();
//		car.display(age,roll,gender,pc,pcmPer);
		
		Student student=new Student();
//		student.roll=roll;
//		student.age=age;
//		student.gender=gender;
//		student.pc=pc;
//		student.pcmPer=pcmPer;
		student.setData(roll,age,gender,pc,pcmPer);

		car.display(student);

		sc.close();
	}

}
