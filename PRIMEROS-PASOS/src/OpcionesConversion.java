import javax.swing.JOptionPane;

public class OpcionesConversion {

	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 54.30;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Dominicanos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 58.45;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Dominicanos");
	}
	
	
}

