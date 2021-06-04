package data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExemplosData {
	
	public static void main(String[] args) {
		
		//data atual
		LocalDate dataHoje = LocalDate.now();
		System.out.println(dataHoje);
		
		//hora atual
		LocalTime horaAgora = LocalTime.now();		
		System.out.println(horaAgora);
		
		//hora truncada				
		LocalTime horaMinuto = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
		System.out.println(horaMinuto);
		
		//parse data
		LocalDate dataEspecificaDoTexto = LocalDate.parse("2017-12-25");
		System.out.println(dataEspecificaDoTexto);
		
		//maximo data
		System.out.println(LocalTime.MAX);
		
		//diferente entre datas e horas
		LocalDateTime inicio = LocalDateTime.of(2021, 1, 25, 10, 00, 00);
		LocalDateTime termino = LocalDateTime.of(2021, 1, 28, 11, 20, 15);
		
		Period periodo = Period.between(inicio.toLocalDate(), termino.toLocalDate());
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		
		Duration duracao = Duration.between(inicio, termino);
		System.out.println(duracao.toDays());
		System.out.println(duracao.toHours());
	}

}
