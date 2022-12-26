package pereira.vinicio.marcos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
@author Marcos Vinicio Pereira

PRIMEIRO DESAFIO
Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo o seguinte critério: • Primeiro os Pares • Depois os Ímpares Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares em ordem decrescente.
Entrada A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada uma delas, um valor inteiro não negativo.
Saída Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo abaixo.

 */
public class Desafio1 {

	public static void main(String[] args) {
		
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impar = new ArrayList<Integer>();
		StringBuilder saida = new StringBuilder();

		Scanner scan;

		while (true) {
			
			scan = new Scanner(System.in);
			final String digitado = scan.nextLine();
			if (digitado.equals("")) {
				break;
			}
			
			int numero = Integer.parseInt(digitado);
			
			if (numero % 2 == 0){
				pares.add(numero);
			} else {
				impar.add(numero);
			}
			
		}
		
		scan.close();

		Collections.sort(pares);
		Collections.sort(impar,Collections.reverseOrder());
		
		for (int i: pares) {
			saida.append(i);
			saida.append("\n");
		}
		
		for (int i: impar) {
			saida.append(i);
			saida.append("\n");
		}

		System.out.println(saida.toString());

	}

}

