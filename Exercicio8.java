//******Não consegui fazer**********/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		Scanner leitorDeVariaveis = new Scanner(System.in);

		List<Integer> listaNumeros = new ArrayList<>();

//		for (int i = 1; i <= 5; i++) {
//			System.out.println("informe o " + i + "º numero");
//			listaNumeros.add(leitorDeVariaveis.nextInt());
//		}
		listaNumeros.add(20);
		listaNumeros.add(10);
		listaNumeros.add(15);
		listaNumeros.add(1);
		listaNumeros.add(30);


		List<Integer> listaOrdenada = new ArrayList<>();
		for (int numero : listaNumeros) {

			int indice = listaOrdenada.size();

			for (int i = 0; i < listaOrdenada.size(); i++) {
				if (listaOrdenada.get(i) >= numero) {
					indice = i;
					break;
				}
			}
			listaOrdenada.add(indice, numero);
		}

		System.out.println("Lista ordenada: ");
		for (int numeroOrdenado : listaOrdenada) {
			System.out.println(numeroOrdenado);
		}

	}
}
