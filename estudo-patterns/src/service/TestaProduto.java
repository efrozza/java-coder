package service;

import modelo.Categoria;
import modelo.ClasseAtivo;
import modelo.Produto;

public class TestaProduto {

	public static void main(String[] args) {

		Categoria categoria = new Fundos();
		categoria.setId(1);
		categoria.setNome("Fundos");

		Categoria categoria2 = new RendaFixa();
		categoria2.setId(2);
		categoria2.setNome("Renda Fixa");

		ClasseAtivo classeAtivo = new ClasseAtivo();
		classeAtivo.setId(1);
		classeAtivo.setNome("multimercado");

		ClasseAtivo classeAtivo2 = new ClasseAtivo();
		classeAtivo2.setId(2);
		classeAtivo2.setNome("debentures");

		Produto produto1 = new Produto();
		produto1.setCategoria(categoria);
		produto1.setClasseAtivo(classeAtivo2);

		Produto produto2 = new Produto();
		produto2.setCategoria(categoria2);
		produto2.setClasseAtivo(classeAtivo2);


	}

}
