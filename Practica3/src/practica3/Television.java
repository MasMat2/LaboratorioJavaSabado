/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author FCFM
 */
public class Television extends DispositivoElectronico implements FuncionesElectronicas{
    private String color;
    public String configMenu(){
        return "";
    }

    @Override
    public String cambiarCanal() {
        return "Cambiando canal";
    }

    @Override
    public String volumen() {
        return "Cambiando volumen";
    }
    
}
