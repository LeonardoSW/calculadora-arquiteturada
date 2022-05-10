package calculadora.services.Calcs;

import calculadora.services.ICalculateHandle;

public class MULT implements ICalculateHandle 
{
    public MULT() {
    }

    @Override
    public double Calculate(double firstNumber, double secoundNumber) {
        return firstNumber * secoundNumber;
    }
}
