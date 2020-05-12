package practica10i;

public abstract class Telefono {
    private String modelo;

    public abstract String[] propiedades(String[] element);

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}