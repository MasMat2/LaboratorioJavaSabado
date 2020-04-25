package practica10;

public class Automovil extends TransporteTerrestre {
    public Double precio;

    public avanzar(int gas){
        if gas>1{
            return "El auto se esta moviendo";
        }
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return this.precio;
    }

}