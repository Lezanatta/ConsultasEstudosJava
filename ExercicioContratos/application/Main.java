package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Contrato;
import models.entities.Parcela;
import models.services.PaypalServices;
import models.services.ServicoDeContrato;

public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		PaypalServices ps = new PaypalServices();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		System.out.print("Data: ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor: ");
		Double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero,data,valor);
		
		System.out.print("Entre com o numero de parcelas: ");
		Integer parcelas = sc.nextInt();
		ServicoDeContrato servico = new ServicoDeContrato(new PaypalServices());
		servico.processarContratos(contrato, parcelas);
		
		for(Parcela p : contrato.getParcelas()) {
			System.out.println(p);
		}

		sc.close();
	}

}
