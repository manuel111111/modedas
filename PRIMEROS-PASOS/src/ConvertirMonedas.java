import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ConvertirPesosADolares(double valor) {
	double monedaDolar = valor / 54.30;
	monedaDolar = (double) Math.round(monedaDolar *100d)/100;
    JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
}

public void ConvertirPesosAEuros(double valor) {
	double monedaEuro = valor / 58.20;
	monedaEuro = (double) Math.round(monedaEuro *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
}



	
}
