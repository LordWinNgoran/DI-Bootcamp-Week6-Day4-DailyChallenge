package atos;

//Daily Challenge : Demo 
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:In this exercise, you have to implement a calculator which can perform addition,
*  subtraction, multiplication, and division.
* date: 02/02/2023
*/
public class Calculator {
	  private double num1;
	  private double num2;
	  public Calculator(double num1, double num2) {
	   this.num1 = num1;
	   this.num2 = num2;
	  }

	 public double add() {
	    return this.num1 + this.num2;
	  }

	  public double subtract() {
		  return this.num1 - this.num2;
	  }

	  public double multiply() {
		  return this.num1 * this.num2;
	  }

	  public double divide() {
		  return this.num1 / this.num2;
	  }

	}