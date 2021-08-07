package textos;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class TestesGerais {
	
	public static void main(String[] args) {
		
		String valor = "250";
		String sinal = "+";	
		
	    NumberFormat numeroFormatadoMoeda = NumberFormat.getInstance();

	    String c = numeroFormatadoMoeda.format(new BigDecimal(valor.toString()));
	    System.out.println("Currency Format: "+ sinal + c);
	}

}
