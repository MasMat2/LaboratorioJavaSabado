package practica11;

public abstract class TransporteTerrestre {
    private String marca;
    private String modelo;
    // Atributo en desuso
    @Deprecated
    public int gas;

    // Funcion en obsoleta por variable en desuso
    @Deprecated
    public void encender(int gas) {
        this.gas = gas;
    }

    public String apagar() {
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