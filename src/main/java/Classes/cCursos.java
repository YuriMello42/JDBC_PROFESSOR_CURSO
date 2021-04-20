package Classes;

public class cCursos {
	private Long id; 
	private String nome; 
	private int professor;
	
	
	public cCursos(Long id, String nome, int professor) {
		super();
		this.id = id;
		this.nome = nome;
		this.professor = professor;
	}
	
	public cCursos(String nome, int professor) {
		super();
		this.nome = nome;
		this.professor = professor;
	}

	
	@Override
	public String toString() {
		return "cCursos [id=" + id + ", nome=" + nome + ", professor=" + professor + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getProfessor() {
		return professor;
	}

	public void setProfessor(int professor) {
		this.professor = professor;
	}

	public Long getId() {
		return id;
	} 
	
	
	

}
