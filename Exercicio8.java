//******Não consegui fazer**********/
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		Scanner leitorDeVariaveis = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		
		System.out.println("informe o 1º numero");
		numero1 = leitorDeVariaveis.nextInt();
		System.out.println("informe o 2º numero");
		numero2 = leitorDeVariaveis.nextInt();
		System.out.println("informe o 3º numero");
		numero3 = leitorDeVariaveis.nextInt();
		System.out.println("informe o 4º numero");
		numero4 = leitorDeVariaveis.nextInt();
		System.out.println("informe o 5º numero");
		numero5 = leitorDeVariaveis.nextInt();
		
		System.out.println("LISTA-A => " +numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
		
	    if(numero1>numero2) {
	    	if(numero1>numero3) {
	    		if(numero1>numero4){
	    			if(numero1>numero5){
	    				System.out.println("o maior é o " + numero1);
	    			
	    				
	    			}
	    		}
	    	}
	    
        }
	
	}
}
