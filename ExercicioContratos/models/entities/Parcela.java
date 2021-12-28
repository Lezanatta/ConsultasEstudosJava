package models.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Parcela {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Double valor;
	private Date vencimento;

	
	public Parcela() {
		
	}

	public Parcela(Double valor, Date vencimento) {
		this.valor = valor;
		this.vencimento = vencimento;
	}

	public Double getValor() {
		return valor;
	}

	public Date getVencimento() {
		return vencimento;
	}
	@Override
	public String toString() {
		return sdf.format(getVencimento()) + " - "
				+ String.format("%.2f", getValor());
	}
}
