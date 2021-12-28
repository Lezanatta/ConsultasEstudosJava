package models.entities;

public class Produto implements Comparable<Produto>{

	private String nome;
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return String.format("Nome do produto: " + getNome()+
				"\nPre�o: " + "%.2f", getPreco());
	}
	
	@Override
	public int compareTo(Produto other) {
		return preco.compareTo(other.getPreco());
	}
}
