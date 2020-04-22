/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;
import java.util.Scanner;
/**
 *
 * @author FCFM
 */
public class Automovil extends Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private String precio;
    
    public String encender(){
        return "Auto encendido";
    }
    public String vuelta() {
    	String str = " ";
    	Scanner input = new Scanner(System.in);
    	while((str.length()>0) &(str.toCharArray()[0]!='i')&(str.toCharArray()[0]!='d')){
            System.out.print("A que lado desea girar (izquierda, derecha): ");
            str = input.nextLine();
            str = str.toLowerCase() + " ";
        }
        switch(str.charAt(0)){
            case 'i':
                return girarIzquierda();
            case 'd':
                return girarDerecha();
            default:
                return "Entrada no reconocida";
        }
    }
    public String girarDerecha(){
        return "Girando a la derecha";
    }
    public String girarIzquierda(){
        return "Girando a la izquierda";
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
}
