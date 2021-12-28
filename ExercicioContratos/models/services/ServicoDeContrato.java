package models.services;

import java.util.Calendar;
import java.util.Date;

import models.entities.Contrato;
import models.entities.Parcela;

public class ServicoDeContrato {

	IPagamentoServices pagamentoService;
	
	public ServicoDeContrato(IPagamentoServices pagamentoService) {
		this.pagamentoService = pagamentoService;
	}
	
	public void processarContratos(Contrato contrato,int parcelas) {
		double parcelaBasica = contrato.getValor() / parcelas;
		for(int i = 1; i <= parcelas; i++) {
			double parcelaComJuros = parcelaBasica + pagamentoService
					.calcularTaxaJuros(parcelaBasica, i);
			double parcelaComTaxa = parcelaComJuros + pagamentoService
					.calcularTaxaPagamento(parcelaComJuros);
			contrato.getParcelas().add(new Parcela(parcelaComTaxa,
					adicionarMes(contrato.getData(), i)));
		}
	}
	
	private Date adicionarMes(Date data, int mes) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, mes);
		return calendar.getTime();
	}
}
