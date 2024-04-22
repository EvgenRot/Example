package Day_65_66_Polymorphism;

public class DrawingApp {

    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();
    }
}

class Shape {
    void draw() {
        System.out.println("Если вы это читаете, значит кто-то забыл переопределить метод \"рисования\" в консоли…");
    }
}

class Circle extends Shape {
    int radius = 7;

    @Override
    void draw() {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class Rectangle extends Shape {
}

