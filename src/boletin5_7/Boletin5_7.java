/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7;
import java.util.Scanner;
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
        Scanner teclado=new Scanner(System.in);
        System.out.println("Presione 1 para calcular el area del cuadrado\nDos para el area del circulo\nTres para el area del triangulo");
        int opcion=teclado.nextInt();
        switch (opcion){
            case 1:System.out.println("Introduzca el lado");
                Cadrado cad1=new Cadrado(teclado.nextDouble());
                System.out.println("El area es "+cad1.calcArea());
                break;
            case 2:System.out.println("Introduzca el radio");
                Circulo circ1=new Circulo(teclado.nextDouble());
                System.out.println("El area es "+circ1.calcArea());
                break;
            case 3:System.out.println("Introduzca la base");
                double base=teclado.nextDouble();
                System.out.println("Introduzca la altura");
                double altura=teclado.nextDouble();
                Triangulo trian1= new Triangulo(base,altura);
                System.out.println("El area es "+trian1.calcArea());
                break;
            default: System.out.println("Opcion incorrecta");
        }
    }
    
}
