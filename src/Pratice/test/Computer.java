package Pratice.test;

public class Computer extends Calculator{

	@Override
	public double areaOfCircle(int param) {
		double result;
		result =Constants.PAI_2 * param * param;
		return result;
	}

}
