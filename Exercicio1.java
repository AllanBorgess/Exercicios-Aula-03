import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner leitorDeVariaveis = new Scanner(System.in);

		Integer primeiro;
		Integer segundo;
		System.out.println("**Informe dois numeros, e veja os intervalas entre eles**");
		System.out.println("Informe o primeiro numero");
		primeiro = leitorDeVariaveis.nextInt();
		System.out.println("Informe o segundo numero");
		segundo = leitorDeVariaveis.nextInt();

		if (primeiro == segundo) {
			System.out.println("**Não existem intervalos entre eles**");
		}

		if (primeiro < segundo) {
			primeiro++;
			if (primeiro == segundo) {
				System.out.println("**Não existem intervalos entre eles**");
			}
		}

		if (primeiro > segundo) {
			primeiro--;
			if (primeiro == segundo) {
				System.out.println("**Não existem intervalos entre eles**");
			}
		}

		if (primeiro < segundo) {
			System.out.println("O intervalo entre eles são:");
			while (primeiro < segundo) {
				System.out.println(primeiro);
				primeiro++;
			}
		}
		if (primeiro > segundo) {
			System.out.println("O intervalo entre eles são:");
			while (primeiro > segundo) {
				System.out.println(+primeiro);
				primeiro--;
			}

		}

	}
}
