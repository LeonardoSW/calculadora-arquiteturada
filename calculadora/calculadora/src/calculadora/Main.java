package calculadora;

import java.util.Scanner;
import calculadora.services.*;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		OperationHandlers operations;
		Scanner input = new Scanner(System.in);
		boolean on = true;
		String strCalc;
		
		System.out.println("=== Calculadora Java ===");
		
		System.out.println("Obs: Todas as opera??es s?o realizadas no formato in-line,\n"
				+ "sendo escrito o calculo matem?tico em uma linha com seus respectivos simbolos matem?ticos,\n"
				+ "por exemplo:\n"
				+ "Exemplo Soma: 11+7,\n"
				+ "Exemplo Divisao: 15/3,\n"
				+ "Exemplo Subtra??o: 8-3\n"
				+ "Exemplo Multiplica??o: 2*3\n"
				+ "\n"
				+ "Para encerrar a aplica??o pressione Enter sem inserir valores.");
	
		while(on) {
			System.out.println("\nRealize aqui o seu calculo:");	
			strCalc = input.nextLine();
			if(strCalc.isEmpty())
					on = false;
			else
			{
				operations = new OperationHandlers(strCalc);
				double response = operations.Calculate();
				System.out.println(response);
			}
		}
		
		System.out.println("\nProgram finished...");
		
	}

}
