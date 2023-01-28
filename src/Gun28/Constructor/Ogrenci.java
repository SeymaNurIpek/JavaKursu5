package Gun28.Constructor;

public class Ogrenci {

    int id;

    String ad;

    String soyad;

    int sinifi;
    public Ogrenci(){// yapici methodlar
        System.out.println("nesne olusturuldu");
    }
    public Ogrenci(int id, String ad, String soyad, int sinifi){
        this.id=id;//this.id--> classin id`si local degisken
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;
    }
    public Ogrenci(int id, String ad, String soyad){
        this(id,ad,soyad,0);//this burda ogrenci



//        this.id=id;//this.id--> classin id`si local degisken
//        this.ad=ad;
//        this.soyad=soyad;
//        this.sinifi=0;
    }
    //    mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
//        buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
//        yapıldığı metos ise Constructor yani yapıcı metodlar
}
