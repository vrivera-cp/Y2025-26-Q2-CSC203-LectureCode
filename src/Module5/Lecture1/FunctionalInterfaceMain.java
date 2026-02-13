package Module5.Lecture1;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        // Assigning an instance of an implementing class
        IntegerOperation intOp = new AddOperation();
        IO.println(intOp.operation(3, 3));

        // Assigning a lambda function
        IntegerOperation intOp2 = (x, y) -> x + y;
        IO.println(intOp.operation(3, 3));
    }
}
