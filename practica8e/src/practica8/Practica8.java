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
        // Ciclo while para agregar una cantidad indefinida de autos
        // El ciclo terminara cuando addCar = False
        while (true) {
            // Preguntar al usuario si quiere agregar otro automovil
            // Darle formato al String para incluir, el nuumero del auto que sera anadido
            System.out.print(String.format("\nDesea agregar el automovil numero %d (si/no): ", autos.size() + 1));
            // Si la entrada del usario comienza con algo diferente a si, salir del ciclo
            // while
            if (!sc.nextLine().startsWith("s")) {
                break;
            }
            // Llamar a constructor del objeto Automovil
            // Agregar nuevo objeto al inicio de la lista
            autos.add(0, new Automovil(10));
            // Llenar los atributos del objeto, con los vaolres indicados por el usuario
            System.out.print("\nIngresa la marca del automvil: ");
            autos.get(0).setMarca(sc.nextLine());
            System.out.print("Ingresa el modelo del automovil: ");
            autos.get(0).setModelo(sc.nextLine());
            System.out.print("Ingresa el precio del automovil: ");
            autos.get(0).setPrecio(sc.nextLine());
        }
        // Como cada objeto se fue moviendo al incio del array list y los demas se
        // recorrieron
        // La lista esta al reves, asi que vamos a ponerla al reves de nuevo
        // Para que este en orden
        Collections.reverse(autos);
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