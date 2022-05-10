package calculadora.services.Calcs;

import calculadora.services.ICalculateHandle;

public class DIV implements ICalculateHandle 
{ 
    public DIV() {
    }

    @Override
    public double Calculate(double firstNumber, double secoundNumber) {
        return firstNumber / secoundNumber;
    }
}
