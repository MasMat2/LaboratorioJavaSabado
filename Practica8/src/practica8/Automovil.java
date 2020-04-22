
package practica8;

public class Automovil {
    private String marca;
    private String modelo;
    private String precio;
    private int gas;

    // Constructor
    public Automovil(int gas) {
        this.encender(gas);
    }

    // Encender funciona como un setter de gas
    private void encender(int gas) {
        this.gas = gas;
    }

    public String alto() {
        return "El automovil se ha detenido";
    }

    public String movimiento(String mov) {
        if (this.gas > 1) {
            return "Moviendose a la " + mov;
        } else {
            return "No hay suficiente gasolina";
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getPrecio() {
        return this.precio;
    }

}