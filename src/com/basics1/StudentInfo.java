package com.basics1;

public class StudentInfo {
	public void printStudent(Student stu1) {
		System.out.println("printStudent"+stu1);
	}
	public static void main(String[] args) {
Student stu1=new Student();
stu1.setId(5);
stu1.setFirstName("shalu");
stu1.setLastName("siva");
stu1.setBranch("cse");
stu1.setGender("female");
System.out.println(stu1.getId);
System.out.println(stu1.getFirstName);
System.out.println(stu1.getLastName);
System.out.println(stu1.getBranch);
System.out.println(stu1.getGender);
StudentInfo showStudent=new StudentInfo();
StudentInfo.printStudent(Student);

}
}