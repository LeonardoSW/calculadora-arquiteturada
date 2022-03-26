package calculadora.Models;

public enum Methods {

	SUM("soma"),
	SUBTRACTION("subtracao"),
	DIVISION("divisao"),
	MULTIPLICATION("multiplicacao");
	
	private String description;
	
	Methods(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
