package Gun36.A05_Interface;

public class Test implements IGosterir,IYazdirir {
    @Override
    public void goster() {
        System.out.println("gosterdi");

    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);
    }

    @Override
    public void yaz() {
        System.out.println("yazdirdi");

    }
}
