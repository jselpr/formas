/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

/**
 *
 * @author Profesor
 */
public class Shape {
    String color;
    public Shape(){
        
    }
    public Shape(String c){
        this.color = c;
    }
    
    public void cambiacolor(String c){
        this.color = c;
        System.out.println("Color cambiado desde Shape color "+color);
    }
}
