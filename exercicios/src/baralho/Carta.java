package baralho;

public class Carta {
	
	String naipe;
	String valor;
	boolean valorConhecido = false;
	
	public String getNaipe() {
		return naipe;
	}
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public boolean isValorConhecido() {
		return valorConhecido;
	}
	public void setValorConhecido(boolean valorConhecido) {
		this.valorConhecido = valorConhecido;
	}
	
	
	

}
