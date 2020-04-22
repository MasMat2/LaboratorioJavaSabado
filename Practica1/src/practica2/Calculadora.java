/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author FCFM
 */
public class Calculadora {
    public static void Calculadora() {
    }

    public double execute(int op, float a, float b) {
        // op es la variable que sera usada para determinar el tipo de operacion que
        // se realizara
        switch (op) {
        case 1:
            return a + b;
        case 2:
            return a - b;
        case 3:
            return a * b;
        case 4:
            // Para evitar un error durante la ejecucion del programa, validar la entrada de
            // b y no dividir entre 0
            if (b == 0) {
                return 0;
            }
            return a / b;

        }
        return 0;
    }
}
