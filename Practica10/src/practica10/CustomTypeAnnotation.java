package practiaca10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomTypeAnnotation{
    public enum Priority{
        LOW, MEDIUM, HIGH
    }

    Priority priority() default Priority.MEDIUM;
    String[] tags() default "";
    String createdBy() default "Max";
    String lastModified() default "08/10/2019";
}
