/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocpjproj;

/**
 *
 * @author Juan
 */
public class OcpjProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heres
        claseGenerica<Integer> valor1 = new claseGenerica<Integer>(new Integer(10));
        System.out.println(valor1);
        
        claseGenerica<String> valor2 = new claseGenerica<String>("hola mundo");
        System.err.println(valor2);
        
        //TreeMap
        NavigableMapTest arbol = new NavigableMapTest();
        arbol.imprimir();
    }
    
}
