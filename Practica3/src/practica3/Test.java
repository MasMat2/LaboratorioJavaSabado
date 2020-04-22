/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author FCFM
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Television tv;
        tv = new Television();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la marca de la television: ");
        tv.setMarca(sc.nextLine());
        System.out.print("Ingresa el modelo de la television: ");
        tv.setModelo(sc.nextLine());
        System.out.println("Television");
        System.out.println("Marca: " + tv.getMarca());
        System.out.println("Modelo: " + tv.getModelo());
        tv.encender();
        System.out.println(tv.volumen());
        System.out.println(tv.cambiarCanal());
        System.out.println(tv.apagar());

    }

}
