package programacao_de_solucoes_computacionais;
import java.util.Scanner;
import java.time.YearMonth;
public class Atividade2 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
    
	int ano, id, id_2050;
	
	int year = YearMonth.now().getYear();
	
	System.out.print("informe o ano nascimento: ");
	
	ano = input.nextInt();
	
	id = year - ano;
	id_2050 = 2050 - ano;
	
	System.out.println("sua idade atual é: "+ id + 
			"\nEm 2050 você terá: "+ id_2050 + ".");
	
	System.exit(0);
	
	
	
	}

}
