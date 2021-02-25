package com.blbz;

@FunctionalInterface
interface IMathFunction{
	int calculate(int a,int b);
}
public class MathOperationApp {

	public static void main(String[] args) {
		IMathFunction add = Integer::sum;
		
		IMathFunction multiply = (x,y)->x*y;
		IMathFunction divide = (x,y)->x/y;
	
		System.out.println("Addition is " + add.calculate(5, 3));
		System.out.println("Multiplication is " + multiply.calculate(5, 3));
		System.out.println("Divide is " + divide.calculate(5, 3));
	}
}