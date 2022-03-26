package calculadora.services;

import calculadora.Models.*;

public class OperationHandlers {

	Methods method;
	double firstNumber;
	double secondNumber;
	CalculateHandle doCalc = new CalculateHandle();
	
	public void OperationHandler(String strCalc) {
		
		if(strCalc.contains("+")) {	
			method = Methods.SUM;
			setNumbers(strCalc, "+");
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
			setNumbers(strCalc, "*");
		}
		
	}
	
	private void setNumbers(String bruteStr, String method) {
		String numberList[] = bruteStr.split(method);
		firstNumber = Double.parseDouble(numberList[0]);
		secondNumber = Double.parseDouble(numberList[1]);
	}
	
	public double Calculate () {
		
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
