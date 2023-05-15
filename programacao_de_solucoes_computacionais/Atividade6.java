package programacao_de_solucoes_computacionais;
import java.util.Scanner;
public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner input = new Scanner(System.in);
	
	double C, F;
	
	System.out.println("digite a temperatura desejada (em Celso): ");
	
	C = input.nextDouble();
	
	F = (C * 1.8) + 32;
	
	System.out.printf("a temperatura de Celso pra Fahremheit (°F) é: %.1f °F.", F);
	
	

	}

}
