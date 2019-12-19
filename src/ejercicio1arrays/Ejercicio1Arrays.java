/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1arrays;

/**
 *
 * @author dam
 */
public class Ejercicio1Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parking artesano;//creamos elparking
        artesano=new Parking();
        artesano.iniciarPlazas();//Llama al iniciar las plazas de la clase parking
        artesano.estadoParking();
    }//main
    
}//class
