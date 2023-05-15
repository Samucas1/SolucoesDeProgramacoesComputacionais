package programacao_de_solucoes_computacionais;
import java.util.Scanner;

public class Prova2 {
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

       
        for (int i = 0; i < 3; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("A soma dos números na diagonal principal da matriz é: " + somaDiagonal);
    }
}	


