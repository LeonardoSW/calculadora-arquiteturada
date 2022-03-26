package calculadora.services;

import calculadora.Models.*;

//This class is responsible for operation handler of calc set by user.
public class OperationHandlers {

	private Methods method;
	private double firstNumber;
	private double secondNumber;
	private CalculateHandle doCalc = new CalculateHandle();
	
	public OperationHandlers(String strCalc) {
		
		if(strCalc.contains("+")) {	
			method = Methods.SUM;
			setNumbers(strCalc, "\\+");
		}
		
		if(strCalc.contains("-")) {	
			method = Methods.SUBTRACTION;
			setNumbers(strCalc, "-");
		}

		if(strCalc.contains("/")) {	
			method = Methods.DIVISION;
			setNumbers(strCalc, "/");
			
		}
		
		if(strCalc.contains("*")) {	
			method = Methods.MULTIPLICATION;	
			setNumbers(strCalc, "\\*");
		}
		
	}
	
	private void setNumbers(String bruteStr, String method) {
		String [] numberList = bruteStr.split(method);
		firstNumber = Double.parseDouble(numberList[0]);
		secondNumber = Double.parseDouble(numberList[1]);
	}
	
	public double Calculate () { //This method run the calculator object by operation method 
		
		switch (this.method) {
		case SUM:
			return doCalc.CalculateSUM(firstNumber, secondNumber);
				
		case SUBTRACTION:
			return doCalc.CalculateSUBTRACTION(firstNumber, secondNumber);
				
		case DIVISION:
			return doCalc.CalculateDIVISION(firstNumber, secondNumber);
				
		case MULTIPLICATION:
			return doCalc.CalculateMULTIPLICATION(firstNumber, secondNumber);
		}
		
		return 0;
	}
	
}
