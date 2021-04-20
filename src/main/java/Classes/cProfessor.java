package Classes;

public class cProfessor {
	private Long id;
	private String nome;
	private int idade;

	public cProfessor(Long id, String nome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	public cProfessor(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	

	@Override
	public String toString() {
		return "cProfessor [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Long getId() {
		return id;
	}

}
