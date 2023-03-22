package avancado;

public class Animal implements Comparable<Animal>{
	
	private Long id;
	
	private String nome;

	public Animal(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(Animal that) {
		return this.nome.compareTo(that.nome);
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + "]";
	}
	
	

}
