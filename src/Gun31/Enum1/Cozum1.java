package Gun31.Enum1;

public class Cozum1 {
    enum Aylar{
        Tanimsiz,OCAK,SUBAT,MART,NISAN,MAYIS,HAZIRAN,
        TEMMUZ,AGUSTOS,EYLUL,EKIM,KASIM,ARALIK

    }

    public static void main(String[] args) {
        Aylar ay=Aylar.MAYIS;
        switch (ay){
            case SUBAT : System.out.println(28);break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31);break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30);  break;
        }
        if (ay==Aylar.MAYIS){// Burda Mayis disinda baska birsey girdimi
            // zam yapildi demiyor
            System.out.println("Zam yapildi");
        }
        System.out.println("ay = " + ay);// toString
        System.out.println("ay.name() = " + ay.name());// Simge olarak Kullanilir
        System.out.println("ay.ordinal() = " + ay.ordinal());//simgenin indexi
        for (Aylar a:Aylar.values())
            System.out.println(a.name()+" - "+a.ordinal());
        /// ayin ismi ve indexi buluyoruz
    }
}
