package Gun31.Enum2;

public class Soru {
  //  enum Role{ADMIN, MUDUR, SATIS, PERSONEL}
 //   enum Statu{AKTIF, PASIF}// bunlarin yerine ayri sinif actik

    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

    public static void main(String[] args) {
        User user1=new User("Seyma",Role.ADMIN,Statu.AKTIF);
        User user2=new User("Emre",Role.MUDUR,Statu.PASIF);
        User user3=new User("KERIM",Role.SATIS,Statu.AKTIF);

        usersil(user1);
        usersil(user2);
        usersil(user3);
        System.out.println("user1 = " + user1);


    }public static void usersil(User user){
        if (user.role==Role.ADMIN){
            System.out.println(user.userName+" Admin silinmez");
        }
    }
}
