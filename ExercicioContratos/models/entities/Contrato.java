package models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numero;
	private Date data;
	private Double valor;
	private List<Parcela> parcelas = new ArrayList<Parcela>();
	
	public Contrato() {
		
	}

	public Contrato(Integer numero, Date data, Double valor) {
		this.numero = numero;
		this.data = data;
		this.valor = valor;
	}

	public Integer getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public Double getValor() {
		return valor;
	}
	
	public List<Parcela> getParcelas(){
		return parcelas;
	}
}
