/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        MayorEdad representante = new MayorEdad("José", "Visa");
        MenorEdad menor = new MenorEdad("Felipe", representante);
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta());
        
    }
}
