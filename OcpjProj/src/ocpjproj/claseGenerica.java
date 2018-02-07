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
public class claseGenerica<T> {
    private T val;
    
    public claseGenerica(T args)
    {
        val = args;        
    }
    public String toString(){
        return "[ "+val+" ]";
    }
    
}
