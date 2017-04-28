package megasena;

import java.util.Scanner;
import java.util.InputMismatchException;


public class apostadorUI {
	
	public void exibirUI() {
		
	
		System.out.println("Informe quantos jogos deseja realizar: ");

		
		boolean quantidadeObtida = false;
			
		do {
			try {
				Scanner entrada = new Scanner (System.in);
				int quantidade = entrada.nextInt();
				RealizaJogos x = new RealizaJogos();
				x.gerarApostas(quantidade);
				quantidadeObtida = true;
			} 
			catch (InputMismatchException e1) {
				System.err.println("O número informado deve ser um inteiro maior que ZERO");
			}
			if (!quantidadeObtida) {
				System.out.println("");
				System.out.println("Infome quantos jogos deseja realizar: ");
			}
		} while(!quantidadeObtida);						
	}
}
