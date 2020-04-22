/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author FCFM
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SimpleString cadena = new SimpleString("the quick brown fox jumps over the lazy dog");
       System.out.println(cadena.compare("sa"));
       System.out.println(cadena.order());
       System.out.println(cadena.count());
       System.out.println(cadena.split(7));
       System.out.println(cadena.join("123"));
       System.out.println(Numbers.compare(1,2));
       System.out.println(Numbers.compare(-1, 2, 3));
       System.out.println(Numbers.iva(50.0,2));
       System.out.println(Numbers.iva(2, 50.0));
    }

}






