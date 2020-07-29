import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner leitorDeVariaveis = new Scanner(System.in);
		int numero=0;
		int valor;
		int segundo = 0;
		
		System.out.println("** Informe um numero e veja a soma dos numeros entre ele ** ");
		valor = leitorDeVariaveis.nextInt();
		
		for (int i = 2; i <= valor; i++) {
			numero += i;
		}
		System.out.print(valor);
		System.out.print(" = ");
		if (valor > segundo) {
			while (valor > segundo) {
				System.out.print(+valor);
				
					System.out.print(" + ");
					valor--;
			}	
			System.out.print(" => ");
			System.out.print(numero);
		}
	}

}

