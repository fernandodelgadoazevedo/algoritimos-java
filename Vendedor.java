package HerancaePolimorfismo;

public class Vendedor extends funcionarios{ 
private String Depto;

public Vendedor(String nome, int idade, int matricula, String Depto)
{
	super(nome,idade, matricula);
	this.Depto=Depto;
}

public String getDepto() {
	return Depto;
}

public void setDepto(String depto) {
	Depto = depto;
}

}
