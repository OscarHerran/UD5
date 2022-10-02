import javax.swing.JOptionPane;
public class Tar10 {

	public static void main(String[] args) {
		// Calcular el numero de ventas mas la suma de ellas 
		String texto=JOptionPane.showInputDialog("¿Cuantas ventas se realizaron?");
		int nVentas = Integer.parseInt(texto);
		double sVentas =0;
		for (int i=0; i<nVentas; i++) {
			String texto2 = JOptionPane.showInputDialog("¿Cual es el valor de la venta? ");
			double venta = Double.parseDouble(texto2);
			sVentas+= venta;
			
		}
		System.out.println("la suma de las ventas es "+ sVentas);

	}

}
