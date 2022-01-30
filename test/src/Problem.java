import java.io.IOException;
import java.util.Scanner;

public class Problem{

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int[][] matriz = new int[12][12];
		double valor = 0;
		if (leitor.next().equals("S")){
			for (int i=0 ; i<12 ; i++){
				for (int j=0 ; j<12 ; j++){
					//matriz[i][j] = leitor.nextInt();
					System.out.println(valor);
					valor += (leitor.nextDouble() * (i<j ? 1:0));
				}
			}
			System.out.printf("Valor: %.1f", valor);
		}else {
			for (int i=0 ; i<12 ; i++){
				for (int j=0 ; j<12 ; j++){
					//matriz[i][j] = leitor.nextInt();
					System.out.println(valor);
					valor += (leitor.nextDouble() * (i<j ? 1:0));
				}
			}
			valor/=66;
			System.out.printf("valor: %.1f", valor);
		}
	}
}