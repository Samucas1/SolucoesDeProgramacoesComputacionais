package programacao_de_solucoes_computacionais;
import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double nota1, nota2, nota3, media;
	
	System.out.print("informe a primeira nota: ");
	nota1=input.nextDouble();	
	System.out.print("informe a segunda nota: ");
	nota2=input.nextDouble();
	System.out.print("informe a terceira nota: ");
	nota3=input.nextDouble();
	
	media=(nota1+nota2+nota3) / 3;
	System.out.printf("A media de notas é: %.2f .", (media));
	
	
    System.exit(0);
    
    
	
	

	}

}
