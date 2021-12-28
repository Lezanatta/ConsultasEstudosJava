package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Produto;

public class Program_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> produtos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o caminho do arquivo: ");
		String path = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String campos[] = line.split(",");
				produtos.add(new Produto(campos[0],Double.parseDouble
						(campos[1])));
				line = br.readLine();
			}
			double media = produtos.stream().map(x -> x.getPreco())
					.reduce(0.0, (x , y) -> x + y) / produtos.size();
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase()
					.compareTo(s2.toUpperCase());
			List<String> itens = produtos.stream().filter(x -> x.getPreco() < media)
					.map(p -> p.getNome())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			System.out.println("Media igual a: " + String.format("%.2f", media));
			itens.forEach(System.out::println);		
			
			//produtos.forEach(System.out::println);
		}
		catch(IOException e) {
			System.out.println("Error! " + e.getMessage());
		}
		sc.close();
	}

}
