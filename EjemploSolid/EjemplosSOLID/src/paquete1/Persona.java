/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String n, int e){
        nombre = n;
        edad = e;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerEdad(int n){
        edad = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    
    public double promedioEdades(ArrayList<Persona> lista){
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = lista.get(i).obtenerEdad();
        }
        promedio = suma/lista.size();
        return promedio;
    }
}
