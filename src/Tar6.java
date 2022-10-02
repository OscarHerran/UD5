import javax.swing.JOptionPane;
public class Tar6 {

	public static void main(String[] args) {
		// Precio de un producto +el IVA
		String texto=JOptionPane.showInputDialog("¿Cual es el precio del producto?");
		double precio=Double.parseDouble(texto);
		final double IVA=0.21;
		double precioFinal=(precio+(precio*IVA));
		JOptionPane.showMessageDialog(null, "El Precio Final es "+ precioFinal);
		

	}

}
