package ex_21May2024_Interface;

public class Lab152_InterfaceI_InterviewQ {
	
}
interface I1{}
interface I2{}
class A{}
class B{}
abstract class C{}
class test extends A{}
class test1 extends B{}

// class test2 extends A,B{} - Multiple inheritance with class not allowed

class test3 implements I1,I2{} //
class test4 extends A implements I1,I2{}
