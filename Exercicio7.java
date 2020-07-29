import java.util.Scanner;

class Exercicio7 {
	public static void main(String[] args) {
		{
			Scanner leitorDeVariaveis = new Scanner(System.in);

			int fatorial = 1;
			int valor;
			int segundo = 0;
			System.out.println("Informe o numero que deja fatorar");
			valor = leitorDeVariaveis.nextInt();

			for (int i = 2; i <= valor; i++) {
				fatorial *= i;
			}
			System.out.print(valor);
			System.out.print("!");
			System.out.print(" = ");
			if (valor > segundo) {
				while (valor > segundo) {
					System.out.print(+valor);
					
						System.out.print(" * ");
						valor--;
				}	
				System.out.print(" => ");
				System.out.print(fatorial);
			}
		}
	}
}
