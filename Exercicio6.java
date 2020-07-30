//       ***NÃO CONSEGUI FAZER***        /
import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {

		Scanner leitorDeVariaveis = new Scanner(System.in);

		Integer primeiro = 1;
		Integer segundo = 1;
		Integer total = primeiro + segundo;

		System.out.print("Informe o número máximo: ");
		Integer maximo = leitorDeVariaveis.nextInt();

		System.out.println("Realizando calculo fibonacci.: ");

		System.out.print("0, " + primeiro + ", " + segundo);

		while (total < maximo) {

			total = primeiro + segundo;
			System.out.print(", " + total);

			primeiro = segundo;
			segundo = total;
		}
	}
}