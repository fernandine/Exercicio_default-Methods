package servico;

public class BrasilTaxa implements TaxaJuros {

	private double taxaPadrao;
	

	public BrasilTaxa(double taxaPadrao) {
		this.taxaPadrao = taxaPadrao;
	}

	@Override
	public double getTaxaPadrao() {
		return taxaPadrao;
	}
}