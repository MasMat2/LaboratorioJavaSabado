package practica9i;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica9i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        String[] propiedades = { "Nombre", "Gamma", "Color" };
        String[] elements = new String[3];
        ArrayList telefonos = new ArrayList();

        for (i = 0; i < 5; i++) {
            Movil nuevo_movil = new Movil();
            System.out.println(String.format("Movil %d", i + 1));
            System.out.print("\tIngresa el nombre: ");
            elements[0] = sc.nextLine();
            System.out.print("\tIngresa el precio: ");
            nuevo_movil.setPrecio(sc.nextInt());
            sc.nextLine();
            System.out.print("\tIngresa el modelo: ");
            nuevo_movil.setModelo(sc.nextLine());
            System.out.print("\tIngresa la gamma: ");
            elements[1] = sc.nextLine();
            System.out.print("\tIngresa el color: ");
            elements[2] = sc.nextLine();
            System.out.print("\tEstas son las propiedades del telefono: ");
            j = 0;
            for (String element : nuevo_movil.propiedades(elements)) {
                System.out.print(String.format("\n\t%s: %s", propiedades[j], element));
                j++;
            }
            System.out.println();
            telefonos.add(nuevo_movil);
        }
        // Imprimir los atributos y llamar las funciones de cada objeto Movil en el
        // array list
        j = 0;
        for (Object objectMovil : telefonos) {
            // Convertir el elemento del array a tipo movil, y guardar la referencia en una
            // nueva variable
            // De esta manera Java va a saber de que tipo de objeto estamos hablando
            Movil movil = (Movil) objectMovil;
            System.out.println(String.format("\nTelefono %d", ++j));
            System.out.println(String.format("Precio del telefono %d", movil.getPrecio()));
            System.out.println(String.format("Modelo del telefono %s", movil.getModelo()));
            System.out.println(movil.encender());
            System.out.println("Ingresa el numero al que deseas marcar: ");
            movil.hacerLlamada(sc.nextInt());
            sc.nextLine();
            movil.finalizarLlamada();
            System.out.println("Ingresa el nombre del contacto al que deseas marcar: ");
            movil.hacerLlamada(sc.nextLine());
            movil.finalizarLlamada();
            System.out.println(movil.apagar());
        }
    }
}
