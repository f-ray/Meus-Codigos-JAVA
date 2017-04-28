package megasena;

import java.lang.Math;
import java.util.ArrayList;

public class RealizaJogos {
	
	private ArrayList <String> apostas = new ArrayList <String>();
	

	public void gerarApostas(int quantidade) {
		
	int apostasGeradas = 0;
		do { 
			String aposta = "";
			for (int i = 0; i < 6;) {
				Double random = ((Math.random() * 59) + 1);
				Integer nEscolhido = random.intValue();
				String s = nEscolhido.toString();
				if (aposta.contains(s) == false) {
					aposta += nEscolhido.toString() + ", ";
					i++;
				}				
			}
			
			apostas.add(aposta);
			apostasGeradas++;
			
		} while (apostasGeradas < quantidade);
		
		
		System.out.println("Apostas Geradas");
		System.out.println("===================");

		listarApostas();	
	} 
		
	
	private void listarApostas() {
		int indice = 1;
		for (String i : apostas) {
			System.out.println(indice + "ª Aposta: " + i);
		indice++;
		}
	}
}
