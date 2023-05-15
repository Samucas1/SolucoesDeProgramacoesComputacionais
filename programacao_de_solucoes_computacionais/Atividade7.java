package programacao_de_solucoes_computacionais;
import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		double salarioMinimo, salarioFuncionario, quantiSalario;
		
		System.out.println("Salário minimo atualmente: ");
		
		salarioMinimo = input.nextDouble();
		
		System.out.println("Digite seu salário:  ");
		 
		salarioFuncionario = input.nextDouble(); 
		
		quantiSalario = salarioFuncionario / salarioMinimo;
		
		System.out.printf("A quantidade de salário mínimo que voce possui é: %.0f ", quantiSalario);
		
		System.exit(0);
		
		
	}

}
