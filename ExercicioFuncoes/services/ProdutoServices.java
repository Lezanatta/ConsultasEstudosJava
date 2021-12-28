package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto_08;

public class ProdutoServices {

	public double filtroSoma(List<Produto_08> produtos,Predicate<Produto_08> pred) {
		double sum = 0;
		for(Produto_08 p : produtos) {
			if(pred.test(p))
				sum += p.getPreco();
		}
		return sum;
	}
}
