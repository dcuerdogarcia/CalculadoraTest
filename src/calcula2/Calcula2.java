package calcula2;

import javax.swing.JOptionPane;

public class Calcula2 {
Modelo mod=new Modelo();
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el primer numero de la operacion"));
        //mod.setNum1(num1);
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo numero de la operacion"));
        int opcion = 0;
        do {
            switch (Integer.parseInt(JOptionPane.showInputDialog("  MENU \n"
                    + "1-Suma\n"
                    + "2-Resta\n"
                    + "3-Division\n"
                    + "4-Multiplicacion"
            ))) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                
            }
        } while (opcion <= 4);

    }

    public void realizaOperacion() {
        

    }
}
