package aplication;

import java.util.ArrayList;
import java.util.List;

import entidades.Alimento;

public class Program {

	public static void main(String[] args) {
		
		//# Exercicio lista de compras
		//# 1. Criar lista de compras com itens iniciais
		//# 2. Adicionar 'tomate' e 'alface' à lista
		//# 3. Remover o item 'pão'
		//# 4. Verificar se 'leite' está na lista
		//# 5. Imprimir a lista final

		List<Alimento> lista = new ArrayList<>();
		
		//# 2. Adicionar 'tomate' e 'alface' à lista
		lista.add(new Alimento ("pao"));
		lista.add(new Alimento("sucrilhos"));
		lista.add(new Alimento ("lasanha"));
		lista.add(new Alimento("leite"));
		lista.add(new Alimento("Alface"));
		lista.add(new Alimento("tomate"));
		
		//# 3. Remover o item 'pão'
		lista.remove(new Alimento("pao"));
		
		
		//# 4. Verificar se 'leite' está na lista
		int contador = 0;
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getAlimento().equals("leite")) {
				System.out.println("tem leite na lista.");
			}else {
				contador++;
			}
		}
		if(contador != 0) {
			System.out.println("Nao tem leite na lista.");
		}
		
		
		//# 5. Imprimir a lista final
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		
	}

}
