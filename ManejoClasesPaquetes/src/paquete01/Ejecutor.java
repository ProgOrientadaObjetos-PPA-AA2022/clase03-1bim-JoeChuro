/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        Hospital h1 = new Hospital();
        h1.establecerNumeroCamas(10);
        
        Hospital h2 = new Hospital();
        h2.establecerNumeroCamas(10);
        
                        
        System.out.printf("%s \n", "Hola desde el main");
    }
}
