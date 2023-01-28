package Gun26.A02_Ornek;

public class SeymaHolding {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        //4. adim: getBirthYear isminde Persona ait bir method yaziniz
        //          calistiginda kisinin dogum yilini giriniz
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person cal1=new Person();
        cal1.name="Seyma Nur";
        cal1.surName="Ipek";
        cal1.age=29;

        Person cal2=new Person();
        cal2.name="Emre";
        cal2.surName="Ipek";
        cal2.age=29;

        //1. yontem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surName = " + cal1.surName);
        System.out.println("cal1.age = " + cal1.age);


        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surName = " + cal2.surName);
        System.out.println("cal2.age = " + cal2.age);
        System.out.println("***************");
        // 2. yontem normal method
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);
        System.out.println("***************");
        // 3. yontem methodu ait oldugu classtan cagir
        cal1.BilgiYazdir();
        cal2.BilgiYazdir();
        System.out.println("*******************");
        // hepsini bir olarak string seklinde yaptik
        // bu toString`e ozel
        //4. yontem
        System.out.println("cal1= "+cal1);
        System.out.println("*****");
        cal1.getBirthYear();
        System.out.println("************");

        System.out.println(cal1.getBirthYear2());
        System.out.println("*******");
        cal1.getInitials();


    }
    public static void BilgiYazdir(Person cal){
        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surName = " + cal.surName);
        System.out.println("cal.age = " + cal.age);
    }
}
