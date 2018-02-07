/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocpjproj;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    
    public static void imprimirEnMayusculas(String string){
            System.out.println(string.toUpperCase());
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    List<String> strings = Arrays.asList("Auditoría","Planes de Negocios TICS","Gestión de TICS","Gestión de Seguridades","CISM");
    
    
    
    //    for(String string : strings){
    //        System.out.println(string);
    //    }

    /*******forEach con expresiones lmbda******/
    //strings.forEach(string->System.out.println(string));
    
    /*******forEch con Referencia de metodos*****/
    strings.forEach(Collections::imprimirEnMayusculas);
    }
    
}
