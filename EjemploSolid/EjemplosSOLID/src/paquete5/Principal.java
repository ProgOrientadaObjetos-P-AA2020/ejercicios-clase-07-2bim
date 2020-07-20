/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        try{
        MenorEdad menor = new MenorEdad("Felipe");
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), menor.obtenerTarjeta());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
