package pereira.vinicio.marcos;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
@author Marcos Vinicio Pereira

SEGUNDO DESAFIO
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
Entrada O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
Obs.: Utilize ponto (.) para separar a parte decimal.

 */

public class Desafio2 {

	public static void main(String[] args) {
		
		final int VALOR = 0;
		final int QUANTIDADE = 1;
		final Float MENOR_NOTA = 2.0F;
		
		Float[][] notas = { {100.0F , 0.0F }
        				  , { 50.0F , 0.0F }
		                  , { 20.0F , 0.0F }
		                  , { 10.0F , 0.0F }
		                  , {  5.0F , 0.0F }
		                  , {  2.0F , 0.0F }
		                  , {  1.0F , 0.0F }
		                  , {  0.5F , 0.0F }
		                  , {  0.25F, 0.0F }
		                  , {  0.1F , 0.0F }
		                  , {  0.05F, 0.0F }
						  , {  0.01F, 0.0F } };
		
		StringBuilder saida = new StringBuilder("NOTAS:\n");
		Scanner scan;
		scan = new Scanner(System.in);
		final String digitado = scan.nextLine();
		float valor = Float.parseFloat(digitado);
		scan.close();
		boolean quebraMoeda = false;
	    final DecimalFormat MOEDA = new DecimalFormat("###,###,##0.00",new DecimalFormatSymbols(new Locale("pt","BR")));
	
		while (valor > 0.0F) {
			
			for (int i = 0; i < notas.length; i++) {
				while (valor >= notas[i][VALOR]){
					notas[i][QUANTIDADE]++;
					valor -= notas[i][VALOR];
				}
			}

			if (valor < 0.01F) {
				notas[notas.length-1][QUANTIDADE]++;
				break;
			}
			
		}
		
		String tipo = "nota(s) ";
		
		for (int i = 0; i < notas.length; i++) {
			
			if (!quebraMoeda && notas[i][VALOR] < MENOR_NOTA) {
				saida.append("MOEDAS:\n");
				quebraMoeda = true;
				tipo = "moeda(s)";
			}
			
			int qtd = (int) Math.ceil(notas[i][QUANTIDADE]); //Math.toIntExact
			
			saida.append(qtd);
			saida.append("\t");
			saida.append(tipo);
			saida.append("\t");
			saida.append("de\tR$ ");
			saida.append(String.format("%6.6s", MOEDA.format(notas[i][VALOR])));
			saida.append("\n");
			
		}

		System.out.println(saida.toString());

	}

}
