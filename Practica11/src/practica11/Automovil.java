package practica11;

//Anotacion personalizada para almacenar autores y fechas de modificacion
@CustomAnnotation(lastModified = "31/12/1999")
public class Automovil extends TransporteTerrestre {
    public Double precio;

    public String avanzar(int gas) {
        // Validar que haya suficiente gas antes de avanzar
        if (gas > 1) {
            return "El auto se esta moviendo";
        }
        return "No hay suficiente gasolina";
    }

    @Override
    public String apagar() {
        return "El auto se ha apagado";
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return this.precio;
    }

}