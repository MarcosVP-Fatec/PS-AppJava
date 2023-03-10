package pereira.vinicio.marcos;

import java.util.Scanner;

/**
@author Marcos Vinicio Pereira
TERCEIRO DESAFIO
Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos do array em que a sua diferença seja igual ao valor alvo.
Exemplo
K = 1
arr = [1,2,3,4]
Existem 3 valores cuja diferença é igual ao valor alvo K: 2-1 = 1, 3-2 = 1, 4-3 = 1.
Descrição do problema:
Os pares têm os seguintes parâmetros:
int k: Um Inteiro, valor alvo.
int arr[n]: Um array de Inteiros.
Retorno
int: O número de pares que satisfazem o critério.
Formatos de Entrada
Seu código deve conter duas entradas n e k, que representam o tamanho do array e o valor alvo.
Seu código deve conter um array de inteiros, de tamanho n.
Exemplos de entrada
STDIN Function
----- --------
5 2 arr[] tamanho n = 5, k =2
1 5 3 4 2 arr = [1, 5, 3, 4, 2]
*/
public class Desafio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] vtexto = scan.nextLine().split(" ");
		
		int n = Integer.valueOf(vtexto[0]);
		int k = Integer.valueOf(vtexto[1]);
		
		vtexto = scan.nextLine().split(" ");
		scan.close();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(vtexto[i]);
		}
		
		int resposta = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = (i+1); j < arr.length; j++) {
			
				if (Math.abs(arr[i]-arr[j]) == k) {
					resposta++;
				}
				
			}
			
		}
		
		System.out.println(resposta);

	}

}
