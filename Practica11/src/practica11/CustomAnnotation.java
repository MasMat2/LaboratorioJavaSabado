package practica11;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Documented;

//Esta anotacion servira para especificar los autores y las modifcaciones
@Documented // Esta anotacion se documentara en Java Docs
@Retention(RetentionPolicy.RUNTIME) // Permitir el acceso de lo elementos de esta funcion en RUNTIME
public @interface CustomAnnotation {
    String author() default "Jhon Lennon";

    String lastModified();

}