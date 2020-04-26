package practica9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practica9 {
    public static void main(String[] args) {
        // Inicializar scanner
        Scanner sc = new Scanner(System.in);
        // Crear array list
        ArrayList autos = new ArrayList();
        // Ciclo for en el que se pedira la informacion de los 10 autos que seran
        // agregados a la lista
        for (int i = 0; i < 2; i++) {
            // Darle formato al String para incluir, el nuumero del auto que sera anadido
            System.out.print(String.format("\nAutomovil numero %d", i + 1));
            // Llamar a constructor del objeto Automovil
            Automovil auto = new Automovil(10);
            // Llenar los atributos del objeto, con los vaolres indicados por el usuario
            System.out.print("\nIngresa la marca del automvil: ");
            auto.setMarca(sc.nextLine());
            System.out.print("Ingresa el modelo del automovil: ");
            auto.setModelo(sc.nextLine());
            System.out.print("Ingresa el precio del automovil: ");
            auto.setPrecio(sc.nextLine());
            // Agregar nuevo objeto a la lista
            autos.add(auto);
        }
        // Imprimir los atributos y llamar las funciones de cada objeto Automovil en el
        // array list
        for (Object objectAuto : autos) {
            // Convertir el elemento del array a tipo auto, y guardar la referencia en una
            // nueva variable
            // De esta manera Java va a saber de que tipo de objeto estamos hablando
            Automovil auto = (Automovil) objectAuto;
            // Imprimir el numero del automovil en el orden en que se ingreso
            System.out.println(String.format("\nAutomovil %d", (autos.indexOf(auto) + 1)));
            // Imprimir los atributos y llamar a los metodos de la clase Automovil
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