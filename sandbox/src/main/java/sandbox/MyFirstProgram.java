package sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("Misha");

    double l = 5;
    System.out.println("Square square with the side " + l + " = " + area(l));

    double a = 4;
    double b  = 6;
    System.out.println("Rectangle square with the sides " + a + " and " + b + " = " + area(a, b));
  }

  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
    }

    public static double area (double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}