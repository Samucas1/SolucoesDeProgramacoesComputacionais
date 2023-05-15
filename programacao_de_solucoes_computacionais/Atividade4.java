package programacao_de_solucoes_computacionais;
import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Scanner input = new Scanner(System.in);
		
	  String funcionario; 
	  
	  double salario, novoSalario, aumento;
	  
	  System.out.println("Nome do funcionário: ");
	  
	  funcionario = input.nextLine();
	  
	  System.out.println("Informe seu salário: "); 
	  
	  salario = input.nextDouble();
	  
	  aumento = salario * 0.25;
	  
	  novoSalario = salario + aumento;
	  
	  System.out.println("nome do funcionário: " + funcionario); 
	  
	  System.out.printf("salário anterior: %.2f reais %n", (salario));
	  
	  System.out.print("Com o aumento de 25%, o salário do funcionario " +funcionario+ " ficou: " + novoSalario+ " Reais.");
	  
	  System.exit(0);
	  
	  
     }

}
