package Gun14;

public class A02_forLoop {
    public static void main(String[] args) {
        /*
        1`den 5`e kadar olan sayilari ekrana yazdirin
         */
        /*
        Kac kere donecegi belli degilse  While belliyse for
         */
        /*
        Basi belli sonu belli yani kac adim donecegi belli ve artis miktari belli ise FOR dongusu
        Kac kere donecegi belli degilse ( kullanacagi 0 degeri girene kadar ) WHILE dongusu
        While dongusunde  döngü kontrolü işlemden sonra ise DO-WHILE dongusudur.

         */
         // 1. yontem
        int i=1;
        while (i<=5){
            System.out.println("i= "+i);
            i++;
        }

        //2. yontem
        System.out.println("2. yontem asagida");
        for (int j = 1; j <=5 ; j++) {
            System.out.println("j ="+j);
            //System.out.println(j);// sadece sayilari yazdirir degisken olamdiginda


        }
    }
}
