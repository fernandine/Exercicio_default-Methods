package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import servico.BrasilTaxa;
import servico.TaxaJuros;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Montante: ");
		double montante = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		TaxaJuros tj = new BrasilTaxa(2.0);
		double pagamento = tj.pagamento(montante, meses);

		System.out.println("Pagamento após " + meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));

		sc.close();
	}
}