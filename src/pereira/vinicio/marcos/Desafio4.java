package pereira.vinicio.marcos;

import java.util.Scanner;

/**
@author Marcos Vinicio Pereira
QUARTO DESAFIO
A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois de olhar para várias páginas impressas por um tempo, você percebe que ele está imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo modo, a metade direita de cada linha está sendo impressa à partir da margem direita e prosseguindo em direção ao centro da página. Por exemplo a linha: THIS LINE IS GIBBERISH está sendo impressa como: I ENIL SIHTHSIREBBIG S Da mesma forma, a linha " MANGOS " está sendo impressa incorretamente como "NAM SOG". Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi impressa para a sua forma original. Você pode assumir que cada linha conterá um número par de caracteres.
Entrada A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Seguem N linhas, cada uma com uma frase com no mínimo 2 e no máximo 100 caracteres de letras maiúsculas e espaços que deverá ser desembaralhada (decifrada) à partir da forma impressa para a sua forma original, conforme especificação acima.
Saída Para cada linha de entrada deverá ser impressa uma linha de saída com a frase decifrada,
*/
public class Desafio4 {

	public static void main(String[] args) {

		StringBuilder saida = new StringBuilder();
		StringBuilder saidaE = new StringBuilder();
		StringBuilder saidaD = new StringBuilder();
		
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		final int N = Integer.valueOf(texto);
		
		int metade;
		
		for (int i = 0; i < N; i++) {
			
			texto = scan.nextLine();
			metade = texto.length()/2;
			
			final String txt_esq = texto.substring(0,metade);
			final String txt_dir = texto.substring(metade);
			
			for (int j = (metade-1); j >= 0; j--) {
				
				saidaE.append(txt_esq.substring(j,j+1));
				saidaD.append(txt_dir.substring(j,j+1));
				
			}
			
			saida.append(saidaE.toString());
			saida.append(saidaD.toString());
			saida.append("\n");
			saidaE =  new StringBuilder();
			saidaD =  new StringBuilder();
			
		}
		
		scan.close();
		System.out.println(saida.toString());
		
	}

}
