package calculadora.services.Calcs;

import calculadora.services.ICalculateHandle;

public class SUB implements ICalculateHandle 
{    
    public SUB() {
    }

    @Override
    public double Calculate(double firstNumber, double secoundNumber) {
        return firstNumber - secoundNumber;
    }
}
