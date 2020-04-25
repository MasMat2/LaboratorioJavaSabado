package practica10;

public class AnotationTest(){
    public static void main(String[] args){
        Class<AnnotationExample> obj = AnnotationExample.class;
        
        if (obj.isAnnotationPresent(CustomTypeAnnotation.class)){
            Annotation annotation = obj.getAnnotation(CustomTypeAnnotation.class);
            CustomTypeAnnotation custom = (CustomTypeAnnotation) annotation;
        }//if

        for (Method method : obj.getDeclaredMethods()){
            if(obj.isAnnotationPresent(CustomMethodAnnotation.class)){
                Annotation annotation = obj.getAnnotation(CustomMethodAnnotation.class);
                CustomMethodAnnotation customMethod = (CustomMethodAnnotation) annotation;
            }//if
        }//for
    }
}