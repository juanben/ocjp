/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.stream.IntStream;

/**
 *
 * @author Usuario
 */
public class UsoStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        IntStream.rangeClosed(0,100)
                .map(i->i*i)
                .filter(i->(i%2)==0)
                .forEach(System.out::println);
    }
    
}
