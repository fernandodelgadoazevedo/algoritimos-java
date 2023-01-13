package JavaFor;

import Desemvolvimento.While;

public class ClassesObjetosatvidadeFuncionario extends While {
	private String priNome;
	private String segNome;
	private String sexo;
	private int idade;
	private int matricula;
	public ClassesObjetosatvidadeFuncionario(String priNome, String segNome, String sexo, int idade, int matricula) {
		super();
		this.priNome = priNome;
		this.segNome = segNome;
		this.sexo = sexo;
		this.idade = idade;
		this.matricula = matricula;
	}
	public String getPriNome() {
		return priNome;
	}
	public void setPriNome(String priNome) {
		this.priNome = priNome;
	}
	public String getSegNome() {
		return segNome;
	}
	public void setSegNome(String segNome) {
		this.segNome = segNome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
