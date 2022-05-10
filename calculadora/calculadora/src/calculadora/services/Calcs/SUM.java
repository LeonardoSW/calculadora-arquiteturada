package calculadora.services.Calcs;

import calculadora.services.ICalculateHandle;

public class SUM implements ICalculateHandle 
{
    public SUM() {
    }

    @Override
    public double Calculate(double firstNumber, double secoundNumber) {
        return firstNumber + secoundNumber;
    }
}
