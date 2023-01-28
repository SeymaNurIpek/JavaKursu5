package Gun34.A04_Protected.Paket2;

import Gun34.A04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="Kopek";//public
        // p1h.yas default diger paketten erisilmez
        // p1h.cinsi proctected diger paketten ulasamadim
        //digerlerine ulasilmadi

    }

}
