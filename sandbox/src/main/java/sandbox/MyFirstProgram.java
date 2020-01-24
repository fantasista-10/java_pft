package sandbox;

public class MyFirstProgram implements TestInt {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    @Override
    public void toDoOneMoreTime() {
        System.out.println("la-la-la");
    }
}