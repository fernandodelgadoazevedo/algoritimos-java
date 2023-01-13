package HerancaePolimorfismo;

public abstract class Cliente {
	private int id;
	private String nome;
	private String end;
	private String tipo;
	
	public Cliente(int id, String nome, String end, String tipo) {
		this.id = id;
		this.nome = nome;
		this.end = end;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String istipo() {
		return tipo;
	}

	public void settipo(String tipo) {
		tipo = tipo;
	}
	

}
