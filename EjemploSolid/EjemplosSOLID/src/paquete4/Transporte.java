/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public abstract class Transporte {
    private double tarifa;
    
    public abstract void establecerTarifa();
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
