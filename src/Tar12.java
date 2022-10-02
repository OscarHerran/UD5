import javax.swing.JOptionPane;
public class Tar12 {

	public static void main(String[] args) {
		// contraseña 
		String contraseña ="12345678";
		int contador = 0;
		
		do {
			String password = JOptionPane.showInputDialog("ingrese la contraseña");
			if (contraseña.equals(password) ) {
				JOptionPane.showMessageDialog(null, "Acierto");
				break;
			}
			contador++;
			
			
		
		}while(contador <= 2);
		
			
	}

	}


