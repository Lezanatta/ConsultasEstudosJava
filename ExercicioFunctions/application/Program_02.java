package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Produto_02;

public class Program_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto_02> produtos = new ArrayList<>();
		
		produtos.add(new Produto_02("Tv", 900.00));
		produtos.add(new Produto_02("Mouse", 50.00));
		produtos.add(new Produto_02("Tablet", 350.50));
		produtos.add(new Produto_02("HD", 80.90));
		
		//CONSUMER
		//Consumer<Produto> cons = p -> p.setPreco(p.getPreco() * 1.1);	
		produtos.forEach(p -> p.setPreco(p.getPreco() * 1.1));
		
		
		//FUNCTION
		
		/*Function<Produto, String> fun = p -> p.getNome().toUpperCase();	
		List<String> names = produtos.stream().map
				(p -> p.getNome().toUpperCase())
				.collect(Collectors.toList());*/
		
		
		//PREDICADO
				//Predicate<Produto> pred = p -> p.getPreco() >= 100;
				produtos.removeIf(p -> p.getPreco() >= 100);
		
		produtos.forEach(System.out::println);
		
	}
}
