package Gun29.A02PrivateErisim;

public class Calisan {
    int id;
    String name;

    String surName;

    private String password;
    // private sadece bulundugu classtan erisim izni var

    public  void sifreAta(String sifre){
        // sifreyi kontrol ederek atayacagim
        if (sifre.length()<8){
            System.out.println("sifre zayif");
        }else {
            password=sifre;
            System.out.println("sifre basariyla kaydedilsi");
        }

    }
    public void sifreGoster(){
        System.out.println("****"+password.substring(4));

    }
}
