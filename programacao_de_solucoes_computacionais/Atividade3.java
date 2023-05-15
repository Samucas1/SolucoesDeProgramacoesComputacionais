package programacao_de_solucoes_computacionais;
import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	double reais, dolar, cotacao;
	
	System.out.println("quantos dolares você possui: ");
	
	dolar = input.nextDouble();
	
	System.out.println("qual a cotação do dolar atual: ");
	
	cotacao = input.nextDouble();
	
	reais = dolar*cotacao;
	
	System.out.printf("o valor em reais:R$%.2f. %n", reais);
	
	
	System.exit(0);
	
	
	
	
	
	}

}
