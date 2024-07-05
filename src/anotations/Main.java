package anotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Annotated annotated = new Annotated();
        annotated.myMethod();
        System.out.println("create annotated object");

        try {

            Class<?> clazz = Annotated.class;

            Method method = clazz.getMethod("myMethod");

            MyAnotation myAnotation = method.getAnnotation(MyAnotation.class);
            System.out.println(myAnotation.toString());


        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
