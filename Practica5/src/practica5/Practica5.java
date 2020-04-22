/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;
import java.util.Scanner;

/**
 *
 * @author FCFM
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num_autos = 2;
        Automovil[] autos = new Automovil[5];
		Scanner input = new Scanner(System.in);
        for(int i=0; i<num_autos;i++){
            autos[i] = new Automovil();
            System.out.println("\nAuto " + (i+1));
            System.out.print("Ingesa la marca: ");
            autos[i].setMarca(input.nextLine());
            System.out.print("Ingesa la modelo: ");
            autos[i].setModelo(input.nextLine());
            System.out.print("Ingesa la color: ");
            autos[i].setColor(input.nextLine());
            System.out.print("Ingesa la precio: ");
            autos[i].setPrecio(input.nextLine());
        }
        for(int i=0; i<num_autos;i++){
            System.out.println("\nAuto "+ (i+1));
            System.out.println("Marca: "+autos[i].getMarca());
            System.out.println("Modelo: "+autos[i].getModelo());
            System.out.println("Color: "+autos[i].getColor());
            System.out.println("Precio: "+autos[i].getPrecio());
            System.out.println("Encendiendo auto: "+autos[i].encender());
            System.out.println(autos[i].avanzar());
            System.out.println(autos[i].vuelta());
        }
    }
    
}
