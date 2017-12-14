/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;
/**
 * Calculo de los dias, meses y años en una cantidad de años introducida.
 * @author pnocedalopez
 */

public class LoVivido {
/**
 * Metodo principal
 * @param args 
 */
    public static void main(String[] args) {
        
        //Declaracion de variables e instanciacion de objetos.
        String n, e;
        int m, d, h, a;
        Calculos calculos = new Calculos();
        
        //Entrada de datos.
        n = JOptionPane.showInputDialog("Escriba su nombre: ");
        e = JOptionPane.showInputDialog("Escriba su edad: ");
        a = Integer.parseInt(e);
        
        //Calculos de días, meses y horas.
        m = calculos.calculoM(a);
        d = calculos.calculoD(a);
        h = calculos.calculoH(d);
        //Salidas.
        JOptionPane.showMessageDialog(null, "Meses: " + m, "Numero de meses vividos de " + n, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Días: " + d, "Numero de días vividos de " + n, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " + h, "Numero de horas vividos de " + n, JOptionPane.INFORMATION_MESSAGE);
        //Fin.
        System.exit(0);

    }

}
