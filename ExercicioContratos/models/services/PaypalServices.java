package models.services;

public class PaypalServices implements IPagamentoServices{

	private static final double TAXA_JUROS = 0.01;
	private static final double TAXA_PAGAMENTO = 0.02;

	public double calcularTaxaJuros(double quantia, int mes) {
		return quantia * mes * TAXA_JUROS;
	}
	
	public double calcularTaxaPagamento(double quantia) {
		return quantia * TAXA_PAGAMENTO;
	}
}
