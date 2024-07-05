package enums;

/**
 * EnumWithComplexFieldsExample
 */
public class EnumWithComplexFieldsExample {

    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.printf("Planet: %s, Mass: %f, Radius: %f, Surface Gravity: %f%n", 
                               p, p.getMass(), p.getRadius(), p.surfaceGravity());
        }
    }
}