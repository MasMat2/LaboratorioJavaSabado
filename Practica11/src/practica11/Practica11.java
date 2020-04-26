package practica11;

import java.util.Scanner;

public class Practica11 {

    public static void main(String[] args) {
        Automovil auto = new Automovil();
        Scanner sc = new Scanner(System.in);
        // Imprir en donde se usar ciertas anotacions
        System.out.println("@Deprected: Se utlizo para indicar que la funcion");
        System.out.println("encender de la clase TransporteTerrestre esta en desuso");
        System.out.println("@customAnnotation: Se utlizo para crear Autmovil");

        // Pedir informacion al usario acerca del las caracteristicas del auto
        System.out.print("\nIngresa la marca del automvil: ");
        auto.setMarca(sc.nextLine());
        System.out.print("Ingresa el modelo del automovil: ");
        auto.setModelo(sc.nextLine());
        System.out.print("Ingresa el precio del automovil: ");
        auto.setPrecio(sc.nextDouble());

        // Imprimir los atributos y llamar a los metodos del objeto auto tipo Automovil
        System.out.println("\nDatos del Automovil");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Precio: " + auto.getPrecio());

        // Pedir al usario el argumento de la funcion avanzar
        System.out.println("Ingres la cantidad de gas que desea ponerle al Automovil: ");
        System.out.println(auto.avanzar(sc.nextInt()));
        System.out.println(auto.apagar());
        System.out.println("@Override: Se utlizo para cambiar el funcionamiento de Apagar");
        System.out.println("en la clase automovil");
    }
}