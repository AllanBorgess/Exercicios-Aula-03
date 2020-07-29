import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner leitorDeVariaveis = new Scanner(System.in);

		String paisA;
		String paisB;
		double habitantesA;
		double habitantesB;
		double porcentagemA;
		double porcentagemB;
		Integer anos = 0;

		System.out.println("Informe o nome do pais em desenvolvimento");
		paisA = leitorDeVariaveis.nextLine();
		System.out.println("Informe o nome do outro pais ja desenvolvido");
		paisB = leitorDeVariaveis.nextLine();
		System.out.println("Informe o numero de habitantes do " + paisA);
		habitantesA = leitorDeVariaveis.nextInt();
		System.out.println("Informe o numero de habitantes do " + paisB);
		habitantesB = leitorDeVariaveis.nextInt();
		System.out.println("Informe a porcentagem de crecimento anual do " + paisA);
		porcentagemA = leitorDeVariaveis.nextInt();
		System.out.println("Informe a porcentagem de crecimento anual do " + paisB);
		porcentagemB = leitorDeVariaveis.nextInt();

		porcentagemA = habitantesA / 100 * porcentagemA;
		porcentagemB = habitantesB / 100 * porcentagemB;

		while (habitantesA < habitantesB && anos == anos) {
			habitantesA = habitantesA + porcentagemA;
			anos++;
		}
		System.out.println("O " + paisA + " precisará de " + anos + " anos para alcançar a população do " + paisB);

	}

}
