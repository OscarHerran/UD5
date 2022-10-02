import javax.swing.JOptionPane;
public class Tar4 {

	public static void main(String[] args) {
		// Area de un circulo
		String Area=JOptionPane.showInputDialog("¿Cual es el radio del circulo?");		
		
			double radio=Double.parseDouble(Area);
			//se crea una variable PI 
			final double PI=3.14;
			//se hace la Operacion matematica
			double area=PI*Math.pow(radio, 2);
			
			System.out.println("el area del circulo es "+area);		
			
			

	}

}
