/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;
import java.util.Scanner;
/**
 *
 * @author FCFM
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la marca del automovil: ");
        String marca = sc.nextLine();
        System.out.print("Ingrese el modelo del automovil: ");
        String modelo = sc.nextLine();
        System.out.print("Ingrese el color del automovil: ");
        String color = sc.nextLine();
        Automovil auto = new Automovil(marca, modelo);
        auto.setColor(color);
        System.out.println("\nInformacion del automovil: ");
        System.out.println("Marca del automovil: " + auto.getMarca());
        System.out.println("Modelo del automovil: " + auto.getModelo());
        System.out.println("Color del automovil: " + auto.getColor());
        System.out.println("\nClase automovil: ");
        System.out.println(auto.encender(100));
        System.out.println(auto.avanzar(10));
        auto.frenar();
        auto.apagar();
        Transporte tr = auto;
        System.out.println("\nClase Transporte:");
        tr.encender(10);
        tr.apagar();
        IAutomovil iauto = new Automovil(marca, modelo, color);
        System.out.println("\nInterfaz de automovil: ");
        System.out.println(iauto.acelerar(0, true));
    }
    
    
}
