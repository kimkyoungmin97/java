package Pratice.test;

public class ComputerExample  {
	
	
	public static void main(String[] args) {
		int radius = 7;
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.println("원의 반지름: " + radius);
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + calculator.areaOfCircle(radius));
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + computer.areaOfCircle(radius));
		
	}

}
