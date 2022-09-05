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
public class Decorador {
    Bebida bebida;

    int costoBebida;
    public Decorador(Bebida bebida) {
        this.bebida = bebida;
    }
    
    public String descripcion;
    public int cost;

    public Decorador(){
    }
    
    
    
    public int soy(Bebida bebida){
        
        cost = cost + 15;
        descripcion = "con Soy ";
        return cost;
    }
    
    public int milk(Bebida bebida){
        cost = cost + 10;
        descripcion = "con Milk ";
        return cost;
    }
    
    public int mocha(Bebida bebida){
        cost = cost + 20;
        descripcion = "con Mocha ";
        return cost;
    }
}
