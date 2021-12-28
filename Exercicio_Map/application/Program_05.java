package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import entities.Candidato;

public class Program_05 {

	public static void main(String[] args) {
		//Map<Candidato, Integer> registros = new TreeMap<>();
		//Map<Candidato, Integer> registros = new HashMap<>();
		Map<Candidato, Integer> registros = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] campos = line.split(",");
				Candidato c = new Candidato(campos[0]);
				if(registros.containsKey(c)){
					registros.put(new Candidato(campos[0])
							, registros.get(c)+Integer.parseInt(campos[1]));
				}
				else {
					registros.put(new Candidato(campos[0]), Integer.parseInt(campos[1]));
				}
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error! " + e.getMessage());
		}
		
		for(Candidato c : registros.keySet()){
			System.out.println(c + ": " + registros.get(c));
		}

	}

}
