package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import models.entities.Aluno;

public class Program_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Aluno> set = new HashSet<>();
		for(int i = 0; i < 3; i++) {
			System.out.print("Quantos estudante terão na " + (1+i)
					+" turma: ");
			int n = sc.nextInt();
			for(int j = 0; j < n; j++) {
				int id = sc.nextInt();
				set.add(new Aluno(id));
			}
		}
		
		System.out.println("Total de estudantes: " + set.size());
		sc.close();

	}

}
