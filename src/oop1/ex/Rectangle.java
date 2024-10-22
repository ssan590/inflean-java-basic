package oop1.ex;

public class Rectangle {
        int width;
        int height;

        int calculateArea() {
            return width * height;
        }

        int calculatePerimeter() {
            return 2 * (width + height);
        }

        boolean isSquare() {
            return width == height;
        }

        void printOut(int area, int perimeter, boolean square) {
            System.out.println("넓이: " + area);
            System.out.println("둘레 길이: " + perimeter);
            System.out.println("정사각형 여부: " + square);

        }
}
