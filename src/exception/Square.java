package exception;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws PerimeterException {
        if (side <= 0) {
            throw new PerimeterException("Сторона не правильно ведена");
        }
        this.side = side;
    }
}
