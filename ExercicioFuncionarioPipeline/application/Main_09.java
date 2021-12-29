package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Main_09 {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = new ArrayList<>();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o caminho do arquivo: ");
		String path = sc.nextLine().trim();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String campos[] = line.split(",");
				funcionarios.add(new Funcionario(campos[0], campos[1], Double.parseDouble(campos[2])));
				line = br.readLine();
			}
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase()
					.compareTo(s2.toUpperCase());
			System.out.print("Entre com o salario: ");
			double salario = sc.nextDouble();
			List<String> emails = funcionarios.stream()
					.filter(f -> f.getSalario() > salario)
					.map(f -> f.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			double soma = funcionarios.stream().filter(f -> f.getNome().charAt(0) == 'M')
					.map(f -> f.getSalario())
					.reduce(0.0, (x, y) -> x + y);					
			
			System.out.println("Email dos funcionarios que possuem o salário "
					+ "maior que " + String.format("%.2f", salario));
			emails.forEach(System.out::println);
			System.out.println("Soma dos salarios dos funcionarios"
					+ "que começam com a letra M: " + soma);
	
			//funcionarios.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error! " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Voce digitou algo errado!");
		}
		sc.close();
	}

}
