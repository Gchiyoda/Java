package entidade;

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double netSalary () {
		return grossSalary - tax; 
		
	}
	
}