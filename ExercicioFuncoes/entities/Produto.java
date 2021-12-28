package entities;


public class Produto {

	private String nome;
	private double preco;
	public String getNome() {
		return nome;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static boolean staticProdutoPredicado(Produto_02 p) {
		return p.getPreco() >= 100;
	}
	
	public boolean nonStaticProdutoPredicado() {
		return preco >= 100;
	}
	
	public static String atualizaNome(Produto_02 p) {
		return p.getNome().toUpperCase();
	}
	
	public String naoStaticAtualizaNome() {
		return nome.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Produto [nome = " + nome + ", preco = " 
				+ String.format("%.2f", preco) + "]";
	}
}
