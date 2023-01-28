package Gun36.A04_Interface;

public class A4 implements IYazdirir,IGosterir{
    /// hem karasal hem uydu
    @Override
    public void goster() {
        System.out.println("Gosterdi");

    }

    @Override
    public void yazdir() {
        System.out.println("yazdirdi");
    }
}
