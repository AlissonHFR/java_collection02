package com.fai.alisson;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		

	}
	
	private Map<String, String> mapa = new HashMap<String, String>();

	private void start() {
		adicionarItensNoMapa();
		exibirValorDoMapaPelaChave("PA");
		
	}
	private void adicionarItensNoMapa(){
		
		mapa.put("SRS", "Santa Rita do Sapucaí");
		mapa.put("PA", "Pouso Alegre");
	}
	private void exibirValorDoMapaPelaChave(String chave) {
		String valorDoItemDoMapa = mapa.get(chave);
		if(valorDoItemDoMapa ==null || valorDoItemDoMapa.isEmpty()) {
			System.out.println("Esta chave não está presente nesse mapa " + chave);
		}else {
			System.out.println("O valor dessa chave é: " + mapa.get(chave));
		}
			
		
	}
}
