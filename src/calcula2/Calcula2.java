package calcula2;

import javax.swing.JOptionPane;

public class Calcula2 {
    
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista vis = new Vista();
        Logica log = new Logica();
        vis.introducir(mod);
        log.realizaOperacion(mod);
        vis.imprimir(mod);
        
    }
    
}
