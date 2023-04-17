package Preparatoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class NomeData {
	public static void main(String[] args) {

		String nome = "Gerson";
		LocalDate hoje = LocalDate.now();
		Locale brasil = new Locale("pt", "BR");
		
//		System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		
		
		LocalDateTime agora = LocalDateTime.now();
		String saudacao = null;
		if(agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom dia";
		}else if(agora.getHour() >= 0 && agora.getHour() < 18) {
			saudacao = "Boa tarde";
		}else if(agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao = "Boa noite";
		}else {
			saudacao = "Ola";
		}
		System.out.println(saudacao);
		System.out.printf("Ola, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase() );
	}
}
