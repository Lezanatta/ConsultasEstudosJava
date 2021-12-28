package Pck_ExercicioProposto;

public class Produto {

	private String nome;
	private double valor;
	private int quantidade;
	public String getNome() {
		return nome;
	}
	
	public Produto(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double CalcularValor() {
		return valor*quantidade;
	}
	
	@Override
	public String toString() {
		return String.format(nome + ", " + "%.2f",CalcularValor());
	}
}
