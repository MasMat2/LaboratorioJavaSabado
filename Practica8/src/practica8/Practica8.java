package practica8;

import java.util.Scanner;

import practica8.DispositivoElectronico;

public class Practica8 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        // Crear objeto telefono y configurar con los atributos senalados
        Telefono tel = new Telefono();
        System.out.println("\nCreando telefono: ");
        System.out.print("Ingresa la marca del telefono: ");
        tel.setMarca(sc.nextLine());
        System.out.print("Ingresa el modelo del telefono: ");
        tel.setModelo(sc.nextLine());
        System.out.print("Ingresa el color del telefono: ");
        tel.setColor(sc.nextLine());
        System.out.print("Ingresa el precio del telefono: ");
        tel.setPrecio(sc.nextFloat());
        // Limpiar buffer
        sc.nextLine();
        // Crear arreglo de contactos con la informacion ingresada por el usuario
        System.out.println("\nCrear contactos:");
        Contacto[] contactos = new Contacto[5];
        for (i = 0; i < 0; i++) {
            contactos[i] = new Contacto();
            System.out.println(String.format("\nContacto %d:", i + 1));
            System.out.print("Telefono: ");
            contactos[i].setTelefono(sc.nextLine());
            System.out.print("Nombre: ");
            contactos[i].setNombre(sc.nextLine());
            System.out.print("Correo electronico: ");
            contactos[i].setMail(sc.nextLine());
        }
        System.out.println("\n");
        System.out.println(tel.encender());
        // Pedir por la contrasena de la red inalambrica
        System.out.println("Ingrese la contrasena de la red wifi: ");
        System.out.println("(hint)a=b abc");
        System.out.println(tel.wifiCon(sc.nextLine()));

        // Realizar una llamada a un contacto si el usario lo desea, a un numero
        // especifico de lo contrario
        System.out.println("\nDesea llamar a alguien de su lista de contactos?(s/n): ");
        if (sc.nextLine().startsWith("s")) {
            System.out.println("Eliga un contacto:");
            i = 0;
            for (Contacto contact : contactos) {
                System.out.println(String.format("%d %s", ++i, contact.getNombre()));
            }
            do {
                i = sc.nextInt() - 1;
            } while (i < 0 || i > 4);
            System.out.println(tel.iniciar_llamada(contactos[i].getNombre()));
        } else {
            System.out.println("Escriba el numero que desea llamar: ");
            System.out.println(tel.iniciar_llamada(sc.nextInt()));
        }
        System.out.println(tel.finalizar_llamada());
        tel.apagar();
        // Limpiar buffer
        sc.nextLine();
        // Crear nuevo telefono usando las caracteristicas del polimorfismo
        System.out.println("\nNuevo telefono: ");
        DispositivoElectronico ntel = new Telefono();
        System.out.println("Ingresa la marca del telefono: ");
        ntel.setMarca(sc.nextLine());
        System.out.println("Ingresa el modelo del telefono: ");
        ntel.setModelo(sc.nextLine());
        System.out.println("Informacion del telefono:");
        System.out.println(String.format("Marca: %s", ntel.getMarca()));
        System.out.println(String.format("Modelo: %s", ntel.getModelo()));
        System.out.println(ntel.encender());
        System.out.println(ntel.apagar());
    }
}