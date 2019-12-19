/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1arrays;

/**
 *
 * @author D.C.R.
 */
public class Parking {
    String[] plazas;

    public Parking() {//constructor
        plazas=new String[100];//establecemos numero de plazas que tiene el parking
    }
    public Parking(int numeroPlazas) {// esto sirve para hacer pruebas,,para no probar con 100, este no es necesario
        plazas=new String[numeroPlazas];
    }
    public void iniciarPlazas(){//Sirve para inicializar las plazas
        for(int nplaza=0; nplaza < plazas.length;nplaza++)
        {
            plazas[nplaza]="Libre";//Accion que me dice como son las plazas, es este caso libres
        }
    }
    public void estadoParking(){
        int nplaza;
        plazas[1]="Ocupada";
        System.out.println("nº plaza Estado");
        for(nplaza=0; nplaza < plazas.length;nplaza++)
        {
            System.out.println(nplaza+ "-" +plazas[nplaza]); 
    }
    }//busqueda secuencial encuentra el primer valor igual a libre, return posicion donde se encuentra el primer valor = valor, -1 en caso contrario
    public int busqueda(){
        int nplaza;
        boolean encontrado;
        nplaza=0;
        encontrado=false;
        while(!encontrado&& nplaza<plazas.length){
            if(plazas[nplaza].equalsIgnoreCase("Libre")){
                encontrado=true;}
            else{
                nplaza++;
            }
        }
        if(!encontrado){
            nplaza=-1;
        }
        return nplaza;
    }
    public void entrada(){
        int nplaza;
          nplaza=busqueda();
          if(nplaza==-1){
              System.out.println("Completo");
          }else{
              plazas[nplaza]="OCUPADO";
              System.out.println("LA PLAZA ASIGNADA ES:"+nplaza);
          }
    }
}//clase
