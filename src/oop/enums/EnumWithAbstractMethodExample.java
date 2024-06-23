/*
  Enum with Abstract method example
 */
package oop.enums;

/**
 * EnumWithAbstractMethodExample
 * @author namtv698
 */
public class EnumWithAbstractMethodExample {
    public static void main(String[] args) {
        double x = 10.9;
        double y = 5.1;

        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
    
}
