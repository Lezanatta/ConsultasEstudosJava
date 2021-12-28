package entities;

public class Produto_08 {

	private String nome;
	private Double preco;
	public String getNome() {
		return nome;
	}
	
	public Produto_08(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
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
		return "Produto_08 [nome= " + nome + ", preco= " + preco + "]";
	}	
}
