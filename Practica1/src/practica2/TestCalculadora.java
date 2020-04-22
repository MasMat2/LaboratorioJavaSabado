/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author FCFM
 */
public class TestCalculadora {

    public static void main(String[] args) {
        // Crear objeto para capturar entrada
        Scanner input = new Scanner(System.in);
        // Crear objeto calculadora
        Cal casio = new Cal();
        casio.setMarca("Casio");
        String marca = casio.getMarca();
        System.out.println("La marca de la calculadora es: " + marca);

        // Esta variable guarda el tipo de operacion que se va a realizar
        int op = 0;
        double ans = 0;
        // Arreglo de las diferentes operaciones disponibles
        String operaciones[] = { "Suma", "Resta", "Multiplicacion", "Division" };
        // Preguntar al usuario por el tipo de operacion que desea realizar
        // Validar entrada
        while (op < 1 | op > 4) {
            System.out.println("Eliga el tipo de operacion:\n\t1)Suma\n\t2)Resta\n\t3)Multiplicacion\n\t4)Division");
            op = input.nextInt();
        }
        // Preguntar al usuario por el numero "a" y el numero "b" para realizar la
        // operacion que pidio
        System.out.println("Eligio la operacion " + operaciones[op - 1]);
        input.nextLine();
        System.out.print("Ingrese el primer numero: ");
        String a = input.nextLine();
        System.out.print("Ingrese el segundo numero: ");
        String b = input.nextLine();
        switch (op) {
        case 1:
            ans = casio.suma(Float.parseFloat(a), Float.parseFloat(b));
            break;
        case 2:
            ans = casio.resta(Float.parseFloat(a), Float.parseFloat(b));
            break;
        case 3:
            ans = casio.multiplicacion(Float.parseFloat(a), Float.parseFloat(b));
            break;
        case 4:
            ans = casio.division(Float.parseFloat(a), Float.parseFloat(b));
            break;
        }
        System.out.println("El resultado de la " + operaciones[op - 1] + " es " + ans);

    }

}
