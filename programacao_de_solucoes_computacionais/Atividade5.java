package programacao_de_solucoes_computacionais;
import java.util.Scanner;
public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double diagonalmaior, diagonalmenor, area;
		
		System.out.print("Digite a diagonal maior do losango: ");
		
	    diagonalmaior = input.nextDouble();
		
		System.out.print("digite a diagonal menor do losango: ");
		
		diagonalmenor = input.nextDouble();
		
		area = (diagonalmaior * diagonalmenor)/2;
		
	    System.out.printf("a área do losango é: %.2f", area);
	       
        System.exit(0);
        
	}

}
 