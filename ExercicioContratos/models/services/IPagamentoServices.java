package models.services;

public interface IPagamentoServices {

	public double calcularTaxaJuros(double quantia, int mes);
	public double calcularTaxaPagamento(double quantia);
}
