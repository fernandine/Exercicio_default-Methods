package servico;

public class UsaTaxa implements TaxaJuros {

	private double taxaPadrao;

	public UsaTaxa(double taxaPadrao) {
		this.taxaPadrao = taxaPadrao;
	}

	@Override
	public double getTaxaPadrao() {
		return taxaPadrao;
	}
}