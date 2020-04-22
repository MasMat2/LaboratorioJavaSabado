/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author FCFM
 */
public class Practica {

    public static void main(String[] args) {
        // Crear objeto para capturar entrada
        Scanner input = new Scanner(System.in);
        // Crear objeto calculadora
        Calculadora calc = new Calculadora();

        // Esta variable guarda el tipo de operacion que se va a realizar
        int op = 0;
        double ans;
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

        //Llamar al metodo que calculara el resultado de la operacion
        ans = calc.execute(op, Float.parseFloat(a), Float.parseFloat(b));
        //Imprimir el resultado
        System.out.println("El resultado de la " + operaciones[op - 1] + " es " + ans);

    }

}
