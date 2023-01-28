package Odevler.Odev4;

public class GeometriMain {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.setRadius(5);
        System.out.println(c.getArea());

        Rectangle r=new Rectangle();
        r.setLength(5);
        r.setWidth(4);
        System.out.println(r.getArea());


    }
}
