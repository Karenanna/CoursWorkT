package exception;

public class PerimeterSquare {
    public void getPerimeter() throws PerimeterException {
        Square square = new Square();
        try {
            square.setSide(10);
        } catch (PerimeterException e) {
            e.printStackTrace();
        } catch (NumberFormatException ex) {
            throw new PerimeterException("Поле не коректное", ex);
        }

    }
}
