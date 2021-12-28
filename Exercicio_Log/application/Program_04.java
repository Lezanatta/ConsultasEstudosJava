package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import models.entities.LogEntrada;

public class Program_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o camanho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<LogEntrada> set = new HashSet<>();
			String line = br.readLine(); 
			while(line != null) {
				String[] campos = line.split(" ");
				String nome = campos[0];
				Date momento = Date.from(Instant.parse(campos[1]));
				set.add(new LogEntrada(nome,momento));
				line = br.readLine();
			}	
			System.out.println("Total de usuários: " + set.size());
		}
		catch(IOException e) {
			System.out.println("Error! " + e.getMessage());
		}
		
		sc.close();;
	}

}
