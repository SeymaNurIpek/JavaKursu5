package Odevler.Odev4;

public class Circle extends Data {


    @Override
    public double getArea() {
        return pi*getRadius()*getRadius();
    }
}
