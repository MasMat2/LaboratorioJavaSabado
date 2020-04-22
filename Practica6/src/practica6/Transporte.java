/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author FCFM
 */
public abstract class Transporte {
    private String marca;
    private String modelo;
    public Transporte(String marca, String modelo){
        setMarca(marca);
        setModelo(modelo);
    }
    public abstract String encender(int gasolina);
    public void apagar(){
        System.out.println("Automovil apagado");
    }

    /**
     * @return the marca
     */
    public final String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public final void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public final String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
