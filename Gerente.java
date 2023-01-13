package HerancaePolimorfismo;

public class Gerente extends funcionarios{ 
	private double bonus;
	
	public Gerente (String nome, int idade, int matricula, double bonus)
	
	{
		super(nome,idade,matricula);
		this.bonus=bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
			
}