public class Rectangle extends GraphicObject {
    @Override
    void resize() {
        System.out.println("Resizing rectangle");
    }

    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}