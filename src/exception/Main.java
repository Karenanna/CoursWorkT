package exception;

public class Main {
    public static void main(String[] args) {
        PerimeterSquare perimeterSquare = new PerimeterSquare();
        try {
            perimeterSquare.getPerimeter();
        } catch (PerimeterException e) {
            e.printStackTrace();
        }
    }
}
