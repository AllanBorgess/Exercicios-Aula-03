
public class Exercicio3 {
	public static void main(String[] args) {

		Integer habitantesA = 80000;
		Integer habitantesB = 200000;
		Integer porcentagemA = 2400;
		Integer porcentagemB = 3000;
		Integer anos = 0;

		while (habitantesA < habitantesB && anos == anos) {
			habitantesA = habitantesA + porcentagemA;
			anos++;
		}
		System.out.println("Supondo que a população de um país A seja de 80000 habitantes");
		System.out.println("com uma taxa anual de crescimento de 3%, e que a população de ");
		System.out.println("B seja 200000 habitantes com uma taxa de crescimento de 1.5%");
		System.out.println(" ");
		System.out.println("O pais A precisará de " + anos + " anos para alcançar a população do pais B");
	}
}
