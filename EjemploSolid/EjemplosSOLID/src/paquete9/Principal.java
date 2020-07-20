/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
    }
}
