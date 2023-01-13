package HerancaePolimorfismo;

public class Atividades {
	
	public static void main (String args[])
	{
		Vendedor Fernando = new Vendedor ("Fernando",41,171,"Vendas");
		Gerente Maira = new Gerente ("Maira",26,157,23558);
		
		System.out.println("\t\t /x/x/x/x/x/x/x/x/x/x/x/x/x/ Atividade 02 /x/x/x/x/x/x/x/x/x/x/x/x/x/");
		System.out.println("\n\t\t ######################## VENDEDOR ########################");
		System.out.println("Matricula do Funcionario: "+Fernando.getMatricula()+" "+Fernando.getNome());
		System.out.println("Seu Departamento: "+Fernando.getDepto());
		System.out.println("Sua Idade: "+Fernando.getIdade());

		System.out.println("\t\t ######################## GERENTE  ########################");
		
		System.out.println("Matricula do Funcionario: "+Maira.getMatricula()+" "+Maira.getNome());
		System.out.println("Seu Departamento: "+Maira.getBonus());
		System.out.println("Sua Idade: "+Maira.getIdade());
		
		System.out.println("\t\t /x/x/x/x/x/x/x/x/x/x/x/x/x/ Atividade 01 /x/x/x/x/x/x/x/x/x/x/x/x/x/");
		
		
		PessoaFisica x = new PessoaFisica(5555, "Eugenia Santos", "Rua Municipal, XX - Sao Paulo - SP", "Fisica", 111111111);
		PessoaJuridica y = new PessoaJuridica(999, "Mercado da Alegria", "Morro do Juramento, s/n Rio de Janeiro", "Juridica", 1999999999);
				
		System.out.println("Criei uma redacao puxando os elementos");
		System.out.println("Eu, "+x.getNome()+", "+"redidente no endereco: "+x.getEnd()+", "+"inscrita no CPF: "+x.getCpf()+", "+"Adquiri da pessoas Juridica"+", "+y.getNome()+", "+"Inscrita no CNPJ: "+y.getCnpj());

	
	}
	
	
}
