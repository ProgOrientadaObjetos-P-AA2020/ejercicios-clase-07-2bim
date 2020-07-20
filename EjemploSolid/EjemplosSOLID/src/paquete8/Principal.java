/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        EvaluacionEnsayo ensayo = new EvaluacionEnsayo();
        ensayo.establecerNumeroProblemas(10);
        ensayo.establecerTotalProblemas(20);
        ensayo.establecerPromedioEnsayo();
        System.out.println(ensayo.obtenerPromedioEnsayo());
        
        EvaluacionObjetiva ensayo2 = new EvaluacionObjetiva();
        ensayo2.establecerNumeroPreguntas(10);
        ensayo2.establecerTotalPreguntas(30);
        ensayo2.establecerPromedioObjetivas();
        System.out.println(ensayo2.obtenerPromedioObjetivas());
        
    }
}
