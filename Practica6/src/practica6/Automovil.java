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
public class Automovil extends Transporte implements IAutomovil {
    private String color;
    public Automovil(String marca, String modelo, String color){
        super(marca, modelo);
        setColor(color);
        
    }
    public Automovil(String marca, String modelo){
        super(marca, modelo);
        
    }
    public String avanzar(int gasolina){
        if(gasolina>0){
            return "El auto color "+ getColor() + " esta avanzando";
        }else{
            return "El auto no tiene suficiente gasolina";
        }
    }
    public void frenar(){
        System.out.println("Automovil frenando");
    }
    
    @Override
    public String encender(int gasolina){
        if(gasolina>0){
            return "Automovil encendido";
        }else{
            return "No hay suficiente gasolina";
        }
    }
    
    @Override
    public String acelerar(int gasolina, boolean estado){
        if(gasolina>0 & estado){
        return "Auto acelerando";
        }else if(estado){
            return "No hay suficiente gasolina";
        }else{
            return "El automovil esta apagado";
        }
    }

    /**
     * @return the color
     */
    public final String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public final void setColor(String color) {
        this.color = color;
    }
    
    
}
