package MyFunc;

public class MyFunc {

     public static void bekle(int sn)
     {

         try {
             Thread.sleep(1000*sn);//Bekle diyoruz burda milisaniye cinsinden bekliyor
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }


     }
}
