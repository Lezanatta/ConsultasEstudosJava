package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Produto;
import models.services.CompareServices;

public class Program_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<Produto>();
		String path = "c:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String [] linhas = line.split(",");
				produtos.add(new Produto(linhas[0], Double.parseDouble(linhas[1])));
				line = br.readLine();
			}
			
			Produto ProdutoCaro = CompareServices.max(produtos);
			System.out.println("Produto mais caro: ");
			System.out.println(ProdutoCaro);
		}
		
		catch(IOException e) {
			System.out.println("Error! " + e.getMessage());
		}


		sc.close();
	}

}
