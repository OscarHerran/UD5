import javax.swing.JOptionPane;
public class Tar5 {

	public static void main(String[] args) {
		// Numero divisible entre 2
		String texto=JOptionPane.showInputDialog("Escribe un numero ");
		int num = Integer.parseInt(texto);
		if (num %2==0) {
			System.out.println("El número : " + (num) + " es divisible entre 2" );
		}else {
			JOptionPane.showMessageDialog(null, "El número : " + num + " no es divisible entre 2 ");
		}

	}

}
