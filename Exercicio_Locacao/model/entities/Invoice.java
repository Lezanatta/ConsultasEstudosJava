package model.entities;

public class Invoice {

	private double basicPayment;
	private Double tax;
	
	public Invoice() {
		
	}

	public Invoice(double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
}
