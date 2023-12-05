package com.teachmeskills.lesson9.assignment1;

final class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        if (length <= 0 || width <= 0) {
            System.out.println("Enter positive values");
            return 0;
        }
        return length * width;
    }
}
