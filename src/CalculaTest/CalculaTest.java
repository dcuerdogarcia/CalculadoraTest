package CalculaTest;

import javax.swing.JOptionPane;

public class CalculaTest {
    
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista vis = new Vista();
        Logica log = new Logica();
        vis.introducir(mod);
        log.realizaOperacion(mod);
        vis.imprimir(mod);
        
    }
    
}
