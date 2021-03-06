package practica10i;

public class MovilSamsung extends Telefono implements DispositivoElectronico {
    private int precio;

    public String encender() {
        return "El telefono se ha encendido";
    }

    public String apagar() {
        return "El telefono se ha apagado";
    }

    public void hacerLlamada(int tel) {
        System.out.println(String.format("Llamando a %d", tel));
    }

    public void hacerLlamada(String contacto) {
        System.out.println(String.format("Llamando a %s", contacto));
    }

    public void finalizarLlamada() {
        System.out.println("Finalizando llamada");
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }

    @Override
    public String[] propiedades(String[] elemnts) {
        return elemnts;
    }

}