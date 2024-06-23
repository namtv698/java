/*
  Enum với các phương thức trừu tượng.
 */

package oop.enums;

public enum Operation {
  PLUS {
    public double apply(double x, double y) { return x + y; }
  },
  MINUS {
    public double apply(double x, double y) { return x - y; }
  },
  TIMES {
    public double apply(double x, double y) { return x * y; }
  },
  DIVIDE {
    public double apply(double x, double y) { return x / y; }
  };

  // Method abstraction
  public abstract double apply(double x, double y);
}

