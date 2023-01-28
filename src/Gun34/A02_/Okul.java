package Gun34.A02_;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("Seyma Nur Ipek",OgrTip.lISE,"Say");
        LiseOgrencisi lo2=new LiseOgrencisi("Emre Ipek",OgrTip.lISE,"Sozel");
        IlkOgrenci io=new IlkOgrenci("Eren Ipek",OgrTip.ILK,"Satranc");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io = " + io);

    }
}
