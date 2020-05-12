package practica10i;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica10i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        Telefono nuevo_movil;
        String[] propiedades = { "Nombre", "Gamma", "Color" };
        String[] elements = new String[3];
        ArrayList<Telefono> telefonos = new ArrayList<>();

        for (i = 0; i < 2; i++) {
            if (i < 2) {
                nuevo_movil = new MovilApple();
            } else {
                nuevo_movil = new MovilSamsung();
            }
            System.out.println(String.format("Movil %d", i + 1));
            System.out.print("\tIngresa el nombre: ");
            elements[0] = sc.nextLine();
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
        for (Telefono movil : telefonos) {
            System.out.println(String.format("\nTelefono %d", ++j));
            System.out.println(String.format("\tModelo del telefono %s", movil.getModelo()));
        }
    }
}
