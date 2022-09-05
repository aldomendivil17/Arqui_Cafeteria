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
public class Bebida {
    public int cost;
    public String descripcion;
    
    public int houseBlend(){
        descripcion = " House Blend ";
        cost=25;
        return cost;
    }
    
    public int decaf(){
        descripcion = " Decaf ";
        cost=50;
        return cost;
    }
    
    public int darkRoast(){
        descripcion = " Dark Roast ";
        cost=40;
        return cost;
    }
    
    public int expresso(){
        descripcion = " Expresso ";
        cost=65;
        return cost;
    }
    
    
}
