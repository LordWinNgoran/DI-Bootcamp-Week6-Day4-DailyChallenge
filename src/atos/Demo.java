package atos;

//Daily Challenge : Demo 
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:In this exercise, you have to implement a calculator which can perform addition, 
* subtraction, multiplication, and division.
* date: 02/02/2023
*/
public class Demo {
	public static void main(String args[]) {
	    Calculator obj = new Calculator(10, 94);
	    System.out.println(obj.add());
	    System.out.println(obj.subtract());
	    System.out.println(obj.multiply());
	    System.out.println(obj.divide());
	  }
}
