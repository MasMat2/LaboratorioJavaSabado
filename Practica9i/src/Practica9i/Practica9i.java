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

        for (i = 0; i < 1; i++) {
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
        Object contacto;
        for (Object objectMovil : telefonos) {
            // Convertir el elemento del array a tipo movil, y guardar la referencia en una
            // nueva variable
            // De esta manera Java va a saber de que tipo de objeto estamos hablando
            Movil movil = (Movil) objectMovil;
            System.out.println(String.format("\nTelefono %d", ++j));
            System.out.println(String.format("\tPrecio del telefono %d", movil.getPrecio()));
            System.out.println(String.format("\tModelo del telefono %s", movil.getModelo()));
            System.out.println(String.format("\t%s", movil.encender()));

            System.out.print("\tIngresa el numero al que deseas marcar: ");
            contacto = sc.nextInt();
            System.out.print("\t");
            movil.hacerLlamada((int) contacto);
            sc.nextLine();

            System.out.print("\t");
            movil.finalizarLlamada();

            System.out.print("\tIngresa el nombre del contacto al que deseas marcar: ");
            contacto = sc.nextLine();
            System.out.print("\t");
            movil.hacerLlamada((String) contacto);

            System.out.print("\t");
            movil.finalizarLlamada();

            System.out.print("\t");
            movil.apagar();
        }
    }
}
