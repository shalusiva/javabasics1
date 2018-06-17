package com.basics1;
public class StudentInfo1{
int regId;
String name;
int mark;
StudentInfo1(int id,String name,int mark){
	this.regId=id;
	this.name=name;
	this.mark=mark;
}
public int getRegId() {
	return regId;
}
public void setRegId(int regId) {
	this.regId = regId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}

}

