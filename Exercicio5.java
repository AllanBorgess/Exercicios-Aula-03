public class Exercicio5 {
	public static void main(String[] args) {

		int listaA[] = { 1, 3, 5, 9, 34, 432, 32, 53 ,6 };
		int listaB[] = { listaA[0] * 2, listaA[1] * 2, listaA[2] * 2, listaA[3] * 2, listaA[4] * 2, listaA[5] * 2,
				listaA[6] * 2, listaA[7] * 2, listaA[8] * 2, };

		System.out.print("Elementos do vetor A=> ");
		for (int a = 0; a<=8; a++) {
		System.out.print(listaA[a]);
		System.out.print(",");
	
		}
		System.out.println(" ");
		System.out.print("Elementos do vetor B=> ");
		for (int c = 0; c <= 8; c++) {

			System.out.print(listaB[c]);
			System.out.print(",");

		}

	}
}
