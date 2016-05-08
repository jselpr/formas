/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;
import formas.Shape;
/**
 *
 * @author Profesor
 */
public class Cuadrado extends Shape{
    String color;
    public Cuadrado(){
        
    }
    
    public void cambiacolor(String c){
        this.color = c;
        System.out.println("Color cambiado desde Cuadrado color: "+color);
    }
}
