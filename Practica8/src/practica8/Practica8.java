package practica8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practica8 {
    public static void main(String[] args) {
        // Inicializar scanner
        Scanner sc = new Scanner(System.in);
        // Crear array list con elementos de tipo auto
        ArrayList<Automovil> autos = new ArrayList<Automovil>();
        // Ciclo for en el que se pedira la informacion de los 10 autos que seran
        // agregados a la lista
        for (int i = 0; i < 10; i++) {
            // Darle formato al String para incluir, el nuumero del auto que sera anadido
            System.out.print(String.format("\nAutomovil numero %d", i + 1));
            // Llamar a constructor del objeto Automovil
            // Agregar nuevo objeto a la lista
            autos.add(i, new Automovil(10));
            // Llenar los atributos del objeto, con los vaolres indicados por el usuario
            System.out.print("\nIngresa la marca del automvil: ");
            autos.get(i).setMarca(sc.nextLine());
            System.out.print("Ingresa el modelo del automovil: ");
            autos.get(i).setModelo(sc.nextLine());
            System.out.print("Ingresa el precio del automovil: ");
            autos.get(i).setPrecio(sc.nextLine());
        }
        // Imprimir los atributos y llamar las funciones de cada objeto Automovil en el
        // array list
        for (Automovil auto : autos) {
            // Imprimir el numero del automovil en el orden en que se ingreso
            System.out.println(String.format("\nAutomovil %d", (autos.indexOf(auto) + 1)));
            System.out.println("Marca: " + auto.getMarca());
            System.out.println("Modelo: " + auto.getModelo());
            System.out.println("Precio: " + auto.getPrecio());
            // Preguntar al usario por la direccion en que desea moverse
            System.out.println("Ingresa la direccion en la que el auto tiene que moverse: ");
            System.out.println(auto.movimiento(sc.nextLine()));
            System.out.println(auto.alto());
        }
    }
}