import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room studentDetails = new Room();
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter the student Id");
		int i=reader.nextInt();
		studentDetails.setStudentId(i);
		System.out.println("please enter the student name");
		String s=reader.next();
		studentDetails.setname(s);
		System.out.println("please enter the qualimifying marks");
		float f=reader.nextFloat();
		studentDetails.setqualifyingExamMarks(f);
		System.out.println("please enter the residency");
		char c=reader.next().charAt(0);
		studentDetails.setresidentialStatus(c);
		System.out.println("please enter the yearOfEngg");
		int y=reader.nextInt();
		studentDetails.setyearOfEngg(y);
		reader.close();
		
		System.out.print(" ******** Student Information *******");
		System.out.print("Student Name :"+studentDetails.getname());
		System.out.print("Student ID :"+studentDetails.getStudentId());
		System.out.print("Student Marks :"+studentDetails.getqualifyingExamMarks());
		
	}

}

class Room { 
	private int studentId;
	private String name = "";
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int s) {
		studentId=s;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String a) {
		name = a;
	}
	public float getqualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	public void setqualifyingExamMarks(float b) {
		qualifyingExamMarks=b;
	}
	public char getresidentialStatus() {
		return residentialStatus;
	}
	public void setresidentialStatus(char c) {
		residentialStatus=c;
		
	}
	public int getyearOfEngg() {
		return yearOfEngg;
	}
	public void setyearOfEngg(int d) {
		yearOfEngg=d;
	}
}