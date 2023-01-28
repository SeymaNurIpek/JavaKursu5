package Gun30.Saat;

public class Sabitler {
    final static int birGundekiSaatSayisi=24;
    final static int birSaatDakSayisi=24;
    final static int birDakikadakiSaniyeSayisi=24;
    // hem degistirilemez hem de bir tane o yuzden
    // final ve static yaptik

    public static int hesapla(int gun,int saat,int dak){
        int toplamSaniye=
                gun
                        *birGundekiSaatSayisi
                        *birSaatDakSayisi
                        *birDakikadakiSaniyeSayisi
                        +
                        saat
                                *birSaatDakSayisi
                                *birDakikadakiSaniyeSayisi
                        +
                        dak
                                *birDakikadakiSaniyeSayisi;

        return  toplamSaniye;
        // burda Constructor kullanmadik cunku burda nesne olusturmadik

    }

}
