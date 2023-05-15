package programacao_de_solucoes_computacionais;
import java.util.Scanner; 

public class Prova1 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        int[] numeros = new int[10];

	      
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o " + (i+1) + "º número: ");
	            numeros[i] = sc.nextInt();
	        }

	        
	        int soma = 0;
	        for (int i = 0; i < 10; i += 2) {
	            soma += numeros[i];
	        }

	        
	        System.out.println("A soma dos números nas posições pares do vetor é: " + soma);
	    }
	}

