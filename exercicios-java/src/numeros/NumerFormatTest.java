package numeros;

import java.text.NumberFormat;
import java.util.Locale;

public class NumerFormatTest {
	
	public static void main(String[] args) {
		
		float valor = 123.4567f;
		Locale locJp = new Locale("jp");
		Locale locFR = new Locale("fr");
		
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locFR);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locFR);
		
		for (NumberFormat nf : nfa) {
			System.out.println(nf.format(valor));
		}
		
	}

}
