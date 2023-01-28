package Gun28.Constructor;

public class Okul {
    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci();// nesne oludturma ani;
        ogr1.id=1;
        ogr1.ad="Seyma";
        ogr1.soyad="Ipek";
        ogr1.sinifi=2;
        System.out.println("ogr1.ad = " + ogr1.ad);
        
        //2. yol
        Ogrenci ogr2=new Ogrenci(2,"Emre","ipek",3);
        System.out.println("ogr2.ad = " + ogr2.ad);

        Ogrenci ogr3=new Ogrenci(2,"Kerim","koc");
        System.out.println("ogr3.ad = " + ogr3.ad);


    }
}
