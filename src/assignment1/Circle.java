package assignment1;

final class Circle extends Figure{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        if (radius <= 0) {
            System.out.println("Enter positive values");
            return 0;
        }
        return Math.PI * radius * radius;
    }
}
