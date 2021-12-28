package Pck_ExercicioProposto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> produtos = new ArrayList<Produto>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		LerArquivo(strPath, produtos);
		EscreverArquivo(produtos);
		sc.close();
	}
	
	public static void LerArquivo(String path, List<Produto> produtos) {
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();		
			while(line != null) {
				String[] linha = line.split(",");
				produtos.add(new Produto(linha[0],Double.parseDouble(linha[1])
						,Integer.parseInt(linha[2])));
				line = br.readLine();
				}
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void EscreverArquivo(List<Produto> produto) {
		new File("c:\\temp\\out").mkdir();
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out\\summary.txt",true))) {
			for(Produto p : produto) {
				bw.write(String.format(p.getNome() + ", %.2f",p.CalcularValor()));
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
