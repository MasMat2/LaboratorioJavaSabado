package practica8;

public abstract class DispositivoElectronico {
    private String marca;
    private String modelo;

    public abstract String encender();

    public abstract String apagar();

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