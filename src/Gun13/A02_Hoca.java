package Gun13;

public class A02_Hoca {
    public static void main(String[] args) {
        int sayac=1;
        while (sayac<6)//parantez icine sarti yaziyoruz, donme sarti
        {
            //Bu suslu parantezlerin arasina ise her dondukce yapilacaklar yazilacak
            System.out.println("Merhaba");

            sayac=sayac+1;// veya (sayac++);--> 2 3 4 5 6' ya geldiginde suslu parantez den cikar ve program biter
        }
        System.out.println("Program bitti");
    }
}
