import javax.swing.*;

public class PRUEBA {

	public static void main(String[] args) {

		FUCT monedas = new FUCT();
		
	             
	        while(true) {
	        	
	        	String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moneda"}, "Seleccion")).toString();

	        	switch(opciones) {
	        	case "Conversor de Moneda":
	        		 String input = JOptionPane.showInputDialog("Ingresa el Monto que deseas convertir: ");
	                 if(ValidarNumero(input) == true) {
	                     double Minput = Double.parseDouble(input);
	                     monedas.ConvertirMonedas(Minput);

	                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
	                     if (JOptionPane.OK_OPTION == respuesta){
	                     	System.out.println("Selecciona opción Afirmativa");
	                     }else{
	                        	JOptionPane.showMessageDialog(null, "Programa terminado");                         
	                     }

	                    } else {
	                        JOptionPane.showMessageDialog(null, "Valor inválido");                
	                    }
	                     	break;
	        	

	        	 case "Conversor de Medidas":
	        	 input = JOptionPane.showInputDialog("Ingresa la que deseas convertir ");
	             if(ValidarNumero(input) == true) {
	                 double Minput = Double.parseDouble(input);
	                 

	                 int respuesta = 0;
	                 respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	                 if((respuesta == 0) && (ValidarNumero(input) == true)) { 
	                 } else {
	                     JOptionPane.showMessageDialog(null, "Programa terminado");                     
	                 }

	             } else {
	                 JOptionPane.showMessageDialog(null, "Valor inválido");                
	             }
	             break;
	        }                
	    }
	               
	  }
	    public static boolean ValidarNumero(String input) {
	        try {
	            double x = Double.parseDouble(input);
	            if(x >= 0 || x < 0);
	                return true;
	            } catch (NumberFormatException e) {
	                return false;
	            }
		
		
	}	
	
}
