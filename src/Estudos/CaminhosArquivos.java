package Estudos;
import java.io.File;
import java.util.Scanner;

public class CaminhosArquivos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho da pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getAbsolutePath: " + path.getAbsolutePath());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getTotalSpace: " + path.getTotalSpace());
		System.out.println("getTotalSpace: " + path.delete());
		
	}
}
