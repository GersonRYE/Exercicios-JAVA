import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new GemeFrame();
		
//		double potenciaOuRaiz = Math.random() * 2;
//		
//		System.out.println(potenciaOuRaiz);
//		Random geradorDeNumeros = new Random();
		
//		System.out.println(geradorDeNumeros.ints(1, 2, 5).findFirst().getAsInt());
		

		//System.out.println(geradorDeNumeros.nextInt(3) + 1);
		
		 System.out.println(new BigDecimal("1.1").divide
	             (new BigDecimal("1.9"),3,RoundingMode.UP));
		
	
	}

}
