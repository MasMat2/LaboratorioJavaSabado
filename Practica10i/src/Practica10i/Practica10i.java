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

        for (i = 0; i < 4; i++) {
            System.out.println();
            if ((i % 2) == 0) {
                System.out.print("Creando telefono de tipo Apple: \n");
                nuevo_movil = new MovilApple();
            } else {
                System.out.print("Creando telefono de tipo Samsung: \n");
                nuevo_movil = new MovilSamsung();
            }
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
            // Ya que la declaracion generica de tipo dentro del ArrayList fue de tipo
            // Telefono
            // Solo podemos usar los metodos de encapsulamiento del atributo modelo
            // Y el metodo de propiedades que fue usado arriba
            // Los elementos que estan dentro del array solo pueden ser de tipo
            // telefono
            // Pero pueden instanciarse con sus clases hijas haciendo polimorfismo
            // Y sobrescribiendo los metodos de Telefono en run-time
            System.out.println(String.format("\nTelefono %d", ++j));
            System.out.println(String.format("\tModelo del telefono %s", movil.getModelo()));
        }
    }
}
