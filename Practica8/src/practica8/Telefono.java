package practica8;

import practica8.DispositivoElectronico;
import practica8.WifiConection;

public class Telefono extends DispositivoElectronico implements WifiConection {
    private float precio;
    private String color;

    @Override
    public String encender() {
        return "Telefono encendido";
    }

    @Override
    public String apagar() {
        return "Telefono apagado";
    }

    public String wifiCon(String pswd) {
        // Establezer como contrasena correcta la cadena bcd
        if (pswd.equals("bcd")) {
            return "Contrasena correcta, conetado a la red WiFi";
        }
        return "Contrasena incorrecta";
    }

    public String iniciar_llamada(int num) {
        return String.format("Llamando a %d", num);
    }

    public String iniciar_llamada(String name) {
        return String.format("Llamando a %s", name);
    }

    public String finalizar_llamada() {
        return "Llamada finalizada";
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}