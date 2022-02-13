package servico;

public interface TaxaJuros {

	double getTaxaPadrao();

	default double pagamento(double montante, int meses) {
		return montante * Math.pow(1.0 + getTaxaPadrao() / 100.0, meses);
	}
}