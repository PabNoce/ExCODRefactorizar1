/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovivido;

/**
 * Contiene las operaciones a realizar durante el programa.
 * @author pnocedalopez
 */
public class Calculos {

    /**
     * Calculo de los meses vividos.
     * @param a Entrada de los años vividos.
     * @return Retorna los meses en los años introducidos
     */
    public int calculoM(int a){
    return a * 12;    
    }
    /**
     * Calculo de los dias vividos.
     * @param a Entrada de los años vividos.
     * @return Retorna los dias en los años introducidos. 
     */
    public int calculoD(int a){
    return a * 365;    
    }
    /**
     * Calculo de las horas en los dias
     * @param d Entrada de los dias vividos.
     * @return Retorna las horas totales.
     */
    public int calculoH(int d){
    return d * 24;    
    }
    
}
