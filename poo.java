package poo;

public class poo {
	
	private String funcionarioContratar1;
    private String setorAtuacao;
    private int horasMensais1;
    private String salario;
	
    
    // método construtor

	public Funcionario(String funcionarioContratar, String setorAtuacao, int horasMensais, String salario) {
		this.funcionarioContratar1 = funcionarioContratar1;
		this.setorAtuacao = setorAtuacao;
		this.horasMensais1 = horasMensais1;
		this.salario = salario;
	}


	public String getFuncionarioContratar() {
		return funcionarioContratar1;
	}


	public void setFuncionarioContratar(String funcionarioContratar) {
		this.funcionarioContratar1 = funcionarioContratar;
	}


	public String getSetorAtuacao() {
		return setorAtuacao;
	}


	public void setSetorAtuacao(String setorAtuacao) {
		this.setorAtuacao = setorAtuacao;
	}


	public int getHorasMensais() {
		return horasMensais1;
	}


	public void setHorasMensais(int horasMensais) {
		this.horasMensais1 = horasMensais;
	}


	public String getSalario() {
		return salario;
	}


	public void setSalario(String salario) {
		this.salario = salario;
	}
    
	public void imprimirInfo() {
	
		  System.out.println("\nNome: "+funcionarioContratar1+" \nProfissão: " +setorAtuacao+" \nHoras trabahadas: "+horasMensais1+  " \nhoras Salário: " +salario+"");
	}
    
}

}

package poo;

public class FuncionarioContratado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario contratado = new Funcionario ("Fernando Delgado","Criador de conteudo",41,"157");
		contratado.imprimirInfo();
		
		System.out.println("\nFuncionario Reconhecido");
		
		
		System.out.println("\nVaga da promoção");
		contratado.setSetorAtuacao("Desenvolvedor Full Stack Pleno");
		//contratado.imprimirInfo();
		System.out.println(contratado.getSetorAtuacao());
				
		System.out.println("\nAlteração Sálario ");
		System.out.println();
		contratado.setSalario("10.000");
		//contratado.imprimirInfo();
		System.out.println("Para:R$ "+contratado.getSalario());
		
		contratado.imprimirInfo();