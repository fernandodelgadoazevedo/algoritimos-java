package HerancaePolimorfismo;

public class PessoaFisica extends Cliente{
		private int cpf;
		
		public PessoaFisica(int id, String nome, String end, String tipo, int cpf)
	{
		super(id, nome, end, tipo);
		this.cpf=cpf;
	}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}			
		
}
