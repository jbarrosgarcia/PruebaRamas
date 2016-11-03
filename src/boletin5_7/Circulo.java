/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7;
import java.math.*;
/**
 *
 * @author Jose Barros
 */
public class Circulo {
    private double radio;
    private final float PI=3.14f;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public Circulo (){
    
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcArea(){
        double area=PI*Math.pow(radio, 2);
        return area;
    }
}
