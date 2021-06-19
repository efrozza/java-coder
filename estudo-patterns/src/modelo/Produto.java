package modelo;

public class Produto {

	int id;
	private String nome;
	private Categoria categoria;
	private ClasseAtivo classeAtivo;

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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public ClasseAtivo getClasseAtivo() {
		return classeAtivo;
	}

	public void setClasseAtivo(ClasseAtivo classeAtivo) {
		this.classeAtivo = classeAtivo;
	}

}
