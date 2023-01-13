package HerancaePolimorfismo;

public class PessoaJuridica extends Cliente {
	private int cnpj;
	
	public PessoaJuridica(int id, String nome, String end, String tipo, int cnpj) {
		
		super(id, nome, end, tipo);
		this.cnpj=cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
}	
