package day9.Task2;

class Rectangle extends Figure {
    private double height, width;

    Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * height + 2 * width;
    }
}
