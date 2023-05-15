package programacao_de_solucoes_computacionais;
import  java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int numero, index, limite;
	
	index = -1;
	
	limite = 10;			;
	
	System.out.print("informe o numero: ");
	
	numero =  input.nextInt();
	
	while (index < limite) {
		System.out.println(numero + "x" + (index + 1) + "=" + ((index + 1) * numero ) + " ");
		
		
		index = index + 1;
		
		
		System.exit(0);
		
		
		
		
		
		
	}
	}

}
