package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//mapeia a classe para uma tabela (nome igual ao nome da classe por default)
//toda classe deve estar referenciada no persistence.xml
@Entity
public class Usuario {

	//define a chave primaria da tabela
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String email;
	//@Transient - caso anotado assim o campo nao eh criado no bd

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
