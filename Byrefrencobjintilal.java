package com.dk.objectintilqization;

/*
public class Byrefrencobjintilal {
String nameString;
int age;

public static void main(String[] args) {
	Byrefrencobjintilal b= new Byrefrencobjintilal();
	b.nameString="devanand";
	b.age=32;
	System.out.println("The  name is "+b.nameString + "The age is "+ b.age);
System.out.println("by refernec  varible object intilal");
}
}
*/

/*
//BY USING METHOD OBJECT INTILALIZATION 
public class Byrefrencobjintilal {
String nameString;
int age;
void objmethod(String na, int ag) {
	nameString=na;
	age=ag;
}
void show() {
	System.out.println("the name is "+nameString + "The age is "+age);
}
public static void main(String[] args) {
	Byrefrencobjintilal b= new Byrefrencobjintilal();
	b.objmethod("devanand", 29);
	b.show();
System.out.println("by using method name objec intilalization intilal");
}
}
*/


/*
//WITHOUT USING CONSTRUCTOR  OBJECT INTILALIZATION 
public class Byrefrencobjintilal {
String name="RAJA";
int age=30;
public static void main(String[] args) {
Byrefrencobjintilal b= new Byrefrencobjintilal();
Byrefrencobjintilal b1= new Byrefrencobjintilal();
System.out.println("by using constructor intilal");
System.out.println("the name is "+b.name + " The age is "+b.age);
System.out.println("the name is "+b1.name + " The age is "+b1.age);
}
//here the problem is that without construtor
//above hai and here it is not possible to thate 
//two emp name and age and id same then this approch is bad
}
*/


//BY USING CONSTRUCTOR  OBJECT INTILALIZATION 
public class Byrefrencobjintilal {
String name;
int age;
 public Byrefrencobjintilal(String name, int age) {
	this.name=name;
	this.age=age;
}
public static void main(String[] args) {
Byrefrencobjintilal b= new Byrefrencobjintilal("ramu",44);
Byrefrencobjintilal b1= new Byrefrencobjintilal("ajay",34);
System.out.println("by using constructor intilal obj");
System.out.println("the name is "+b.name + " The age is "+b.age);
System.out.println("the name is "+b1.name + " The age is "+b1.age);
}
//here the problem is that without construtor
//above hai and here it is not possible to thate 
//two emp name and age and id same then this approch is bad
}
