package Gun42;

public class A01_StringBufferAnd {
    public static void main(String[] args) {
        String cumle="";
        cumle=cumle+"Bugun";
        cumle=cumle+"hava";
        cumle+="cok soguk";
        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat(cumle) = " + cumle.concat("cumle"));
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat("fakat dun sicaakti");// concat de birlestirir ama atama islemi yapmaz biz yaptik burda
        System.out.println("cumle = " + cumle);

        /* *******************String Builder********************** */
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugun");
        cumle2.append("hava");
        cumle2.append("Soguk");

        System.out.println("cumle2 = " + cumle2);

        /*      ********** + ,concat ve StringBuilder 3 model in hizi test edilecek************/
        long startTime= System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 10000; i++)
            test1 = test1 + "merhaba";
            System.out.println("+ icin sure " + (System.currentTimeMillis() - startTime) + " ms");


            startTime=System.currentTimeMillis();
            String test2="";
            for (int i= 0; i< 10000; i++)
                test2=test2.concat(" merhaba");
                System.out.println("concat icin sure "+(System.currentTimeMillis()-startTime)+" ms");


            startTime=System.currentTimeMillis();
            StringBuilder test3=new StringBuilder();
            for (int i= 0; i< 10000; i++)
                test3.append(" merhaba");
                System.out.println("concat icin sure "+(System.currentTimeMillis()-startTime)+" ms");

    /*
    // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.
*/
        System.out.println("***************");
       // Yakindan taniyalim
        /* *******************String Builder********************** */
        StringBuilder sb=new StringBuilder();
       sb.append("Bugun");
       sb.append("hava");
       sb.append("Soguk");
        System.out.println("sb = " + sb);//BugunhavaSoguk
        System.out.println("sb.length() = " + sb.length());//14
        sb.append(4);// eklenen her seyi to String`e cevirirek ekler
        System.out.println("sb = " + sb);//BugunhavaSoguk4
        
        sb.reverse();// Stringi tersine cevirir
        System.out.println("sb = " + sb);//4kugoSavahnuguB
        sb.reverse();
        System.out.println("sb = " + sb);//BugunhavaSoguk4

        sb.delete(0,5);//0 dahil 5 dahil degil arasini siler
        System.out.println("sb = " + sb);//havaSoguk4

        sb.deleteCharAt(3);// sadece3. indexi siler
        System.out.println("sb = " + sb);//havSoguk4

        sb.insert(5,"kelime");// 5 nolu index `e kelime`yi ekle : oraya ekleme
        System.out.println("sb = " + sb);//havSokelimeguk4

        sb=new StringBuilder("Bugun hava cok sicak");//sifirlandi ve ilk deger atandi
        System.out.println("sb = " + sb);//Bugun hava cok sicak

        sb.replace(3,8,"bu");//verilen araligi bi stringle degidtirir
        System.out.println("sb = " + sb);//Bugbuva cok sicak

        String strSb=sb.toString();


        /* ******************* */
        StringBuffer sBuffer=new StringBuffer();// tamamen StringBilder ile ayni
        // tek farki, paralel calisan yazilimlarda, StringBuffer kullanilir





    }}
