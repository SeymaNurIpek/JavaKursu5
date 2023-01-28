package Gun39.Soru4;

class C {
    public C() {
        System.out.println("C");//dede
    }
}
class B extends C{
    public B() {
       // super();//ilk super calisir C
        System.out.println("B");// // baba
    }
}
class A extends B {
    public A() {
        System.out.println("A");// evlat
    }
}

public class Soru {
    public static void main(String[] args) {
        A a=new A();
    }
}
