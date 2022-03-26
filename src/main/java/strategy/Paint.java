package strategy;

public class Paint {

    public void drawFig(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.drawFig(new Square());
        paint.drawFig(new Triangle());
    }
}
