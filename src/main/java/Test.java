// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape quad = new Quad();
        Shape pentagon = new Pentagon();
        Shape hexagon = new Hexagon();

        NamePrinter sp = new NamePrinter();

        sp.PrintName(circle);
        sp.PrintName(triangle);
        sp.PrintName(quad);
        sp.PrintName(pentagon);
        sp.PrintName(hexagon);
    }
}
