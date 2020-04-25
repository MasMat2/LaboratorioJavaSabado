package practica10;

public abstract class TrasnporteTerrestre {
    private String marca;
    private String modelo;
    public int gas;

    public void encender(int gas) {
        this.gas = gas;
    }

    public String Apagar() {
        return "El vehiculo se ha apagado";
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }
}