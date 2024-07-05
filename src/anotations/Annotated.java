package anotations;

public class Annotated {
    @MyAnotation(value = "annotation string", number = 1)
    public void myMethod () {
        System.out.println("myMethod");
    }
}
