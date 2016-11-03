/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7;

/**
 *
 * @author Jose Barros
 */
public class Cadrado {
    private double lado;
    public Cadrado() {
    }

    public Cadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
   public double calcArea(){
     double area=lado*lado;
     return area;
   } 
   
}
