import javax.swing.JOptionPane;
public class Tar13 {

	public static void main(String[] args) {
		// CalculadoraInversa
		
		String n1=JOptionPane.showInputDialog("Escribe el primer numero");
		
		String n2=JOptionPane.showInputDialog("Escribe el segundo numero");
		double num1, num2;
		double resultado=0;
		String operar=JOptionPane.showInputDialog("Ingrese signo para operar" + "\n (+) Suma"+ "\n (-) Resta"+"\n (*) Multiplicar"+"\n (/) Dividir"+ "\n (^) Exponente"+ "\n (%) modulo");
		num1 =Integer.parseInt(n1);
		num2 =Integer.parseInt(n2);
		
		  switch (operar){
          case "+":
              resultado=num1+num2;
              break;
          case "-":
              resultado=num1-num2;
              break;
          case "*":
              resultado=num1*num2;
              break;
          case "/":
              resultado=num1/num2;
              break;
          case "^":
              resultado=(int)Math.pow(num1, num2);// utilizamos el metodo Math.pow para retornar la base elevada del exponente
              break;
          case "%":
              resultado=num1%num2;
              break;
      }
		  JOptionPane.showMessageDialog(null,"\n ¡El resustado de tu operacion de :! " +"\n"+ n1+" "+operar+" "+n2+" = "+resultado);
	}

}
