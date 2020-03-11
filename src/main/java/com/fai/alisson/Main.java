package com.fai.alisson;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		

	}
	
	private Map<String, String> mapa = new HashMap<String, String>();
	//private Map<String, String> mapa = null;
	
	private void start() {
		adicionarItensNoMapa();
		exibirValorDoMapaPelaChave("PA");
		iterarMapa();
		
	}
	private void adicionarItensNoMapa(){
		try {
			mapa.put("SRS", "Santa Rita do Sapucaí");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajuba");
			mapa.put("ZORO", "Conceição dos Ouros");
			mapa.put("CAXU", "Cachoeira de Minas");
			
			System.out.println("cheguei no fim do try");
		} catch (Exception e) {
			System.out.println("Ocorreu uma exceção");
		}finally {
			System.out.println("chequei no finally");
		}
		
	}
	private void exibirValorDoMapaPelaChave(String chave) {
		String valorDoItemDoMapa = mapa.get(chave);
		if(valorDoItemDoMapa ==null || valorDoItemDoMapa.isEmpty()) {
			System.out.println("Esta chave não está presente nesse mapa " + chave);
		}else {
			System.out.println("O valor dessa chave é: " + mapa.get(chave));
		}
			
		
	}
	
	private void iterarMapa() {
		System.out.println("---------------");
		for(String chave: mapa.keySet()) {
			System.out.println("Chave: " + chave + " | valor: " + mapa.get(chave));
		}
	}
}
