package com.blbz;

@FunctionalInterface
interface IMathFunction{
	int calculate(int a,int b);
	static void printResult(int a,int b,String function,IMathFunction fobj) {
		System.out.println("Result is " + function + " is " + fobj.calculate(a, b));}
}
public class MathOperationApp {

	public static void main(String[] args) {
		IMathFunction add = Integer::sum;
		
		IMathFunction sub = (x,y)->x-y;
		IMathFunction multiply = (x,y)->x*y;
		IMathFunction divide = (x,y)->x/y;
	
		System.out.println("Addition is " + add.calculate(5, 3));
		System.out.println("Subtraction is " + sub.calculate(5, 3));
		System.out.println("Multiplication is " + multiply.calculate(5, 3));
		System.out.println("Divide is " + divide.calculate(5, 3));
		
		IMathFunction.printResult(6, 3, "Addition", add);
		IMathFunction.printResult(6, 3, "Subtraction", sub);
		IMathFunction.printResult(6, 3, "Divide", divide);
		IMathFunction.printResult(6, 3, "Multiplication", multiply);
	}
}