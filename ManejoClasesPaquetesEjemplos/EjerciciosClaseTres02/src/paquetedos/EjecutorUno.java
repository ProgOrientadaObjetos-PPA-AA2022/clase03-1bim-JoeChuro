/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import paqueteuno.Pelicula;
/**
 *
 * @author reroes
 */
public class EjecutorUno {
    public static void main(String[] args) {
        Pelicula p = new Pelicula();
        p.version = 10;
        System.out.println(p.version);
    }
}
