/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocpjproj;

import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMapTest 
{          
    NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>(); 

    public NavigableMapTest() 
    {
        examScores.put(90, "Sophia");        
        examScores.put(20, "Isabella");       
        examScores.put(10, "Emma");        
        examScores.put(50, "Olivea");        
    }

    
    public void imprimir() {
        System.out.println("Datos en el arbol: " + examScores);
        System.out.println("Orden Desendente: " + examScores.descendingMap());     
            System.out.println("Elementos más altos: " + examScores.tailMap(40));        
            System.out.println("Maarcadores más bajos: " + examScores.firstEntry());    
    }
    
    
}