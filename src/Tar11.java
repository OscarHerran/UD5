import javax.swing.JOptionPane;
public class Tar11 {
 
    public static void main(String[] args) {
 // dias de la semana laborables
        String dia=JOptionPane.showInputDialog("¿Que dia de la semana desea saber si es laborable o no?" + "\n Opciones :"+ "\nLunes " + "\nMartes "+ "\nMiercoles "+ "\nJueves "+ "\nViernes "+ "\nSabado "+ "\nDomingo ");
 
        switch(dia){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
            	JOptionPane.showMessageDialog(null, " ¡Este dia es Laborable! "); 
                break;
            case "Sabado":
            case "Domingo":
            	JOptionPane.showMessageDialog(null, " ¡Este dia no es Laborable! "); 
            default:
            	System.out.println("opcion incorrecta");
        }
    }
}