package sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("world");
    hello("Misha");

    Square s = new Square(5);
    System.out.println("Square square with the side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Rectangle square with the sides " + r.a + " and " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }

}