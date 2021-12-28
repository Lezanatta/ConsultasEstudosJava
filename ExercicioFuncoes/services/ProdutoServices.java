package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto_02;

public class ProdutoServices {

	public double filtroSoma(List<Produto_02> produtos,Predicate<Produto_02> pred) {
		double sum = 0;
		for(Produto_02 p : produtos) {
			if(pred.test(p))
				sum += p.getPreco();
		}
		return sum;
	}
}
