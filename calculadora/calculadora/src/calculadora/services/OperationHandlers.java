package calculadora.services;

import calculadora.Models.*;
import calculadora.services.Calcs.DIV;
import calculadora.services.Calcs.MULT;
import calculadora.services.Calcs.SUB;
import calculadora.services.Calcs.SUM;

//This class is responsible for operation handler of calc set by user.
public class OperationHandlers implements IOperationHandlers {

	private Methods method;
	private double firstNumber;
	private double secondNumber;
	
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
	
	public double Calculate () { //This method run the calculator object by operation method; 
		
		switch (this.method) {
		case SUM:{
			SUM calc = new SUM();
			return calc.Calculate(firstNumber, secondNumber);
		}
		case SUBTRACTION:{
			SUB calc = new SUB();
			return calc.Calculate(firstNumber, secondNumber);
		}		
		case DIVISION:{
			DIV calc = new DIV();
			return calc.Calculate(firstNumber, secondNumber);
		}		
		case MULTIPLICATION:{
			MULT calc = new MULT();
			return calc.Calculate(firstNumber, secondNumber);
		}		
	}
		
		return 0;
	}
	
}
