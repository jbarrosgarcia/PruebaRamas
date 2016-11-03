/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7;

import javax.swing.JOptionPane;
/**
 *
 * @author Jose Barros
 */
public class Boletin5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Introduzca\n1 para calcular el area de un cuadrado\n2 para calcular el area de un circulo\n3 para el area del triangulo "));
        switch (opcion){
            case 1:
                Cadrado cad1=new Cadrado(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el lado")));
                JOptionPane.showConfirmDialog(null, "El area es"+cad1.calcArea());
                break;
            case 2:
                Circulo circ1=new Circulo(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio")));
                JOptionPane.showConfirmDialog(null,"El area es "+circ1.calcArea());
                break;
            case 3:
                
                Triangulo trian1= new Triangulo(Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base")),Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura")));
                JOptionPane.showConfirmDialog(null,"El area es "+trian1.calcArea());
                break;
            default: JOptionPane.showConfirmDialog(null,"Opcion incorrecta");
        }
    }
    
}
