/**
 * 
 */
package Leitor_de_idade;

import java.util.Scanner;

	/**
	 * @author CarlaCorreia
	 * Calcular idade em anos, meses e dias.
	 */

	public class Leitor_de_idade {

	
	public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);
	int idadeAnos, idadeMeses, idadeDias, totalDias;
	
	System.out.println("Digite sua idade:");
	idadeAnos = entrada.nextInt();
	System.out.println("Digite quantos meses:");
	idadeMeses = entrada.nextInt();
	System.out.println("Digite quantos dias");
	idadeDias = entrada.nextInt();
	
	totalDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
	totalDias = totalDias + (idadeMeses * 30);
	totalDias = totalDias + totalDias;
	
	System.out.println("Você tem "+idadeAnos + "anos, " + idadeMeses + "meses, " + idadeDias + "dias.");
	
	}

}
