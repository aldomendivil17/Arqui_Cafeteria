/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author aldom
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precioFinal;
        Bebida bebida = new Bebida();

        System.out.println(bebida.darkRoast());
        
        Decorador beb = new Decorador(bebida);
        precioFinal = beb.milk(bebida);
        precioFinal = beb.mocha(bebida);
        precioFinal+=bebida.darkRoast();
        
        //bebida = $40 DarkRoast
        //Decorador = $10 Milk
        //Decorador = $20 Mocha
        
        //Precio final = $70
        System.out.println("Precio final: $"+precioFinal+"   |  Descripcion: "+bebida.descripcion+beb.descripcion);
        
        
    }
    
}
