package Gun29.A03Protected.Bir;

import javax.print.Doc;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.adi="Emre";
        dok1.bolumu="Dahiliye";
        dok1.hastaneAd="Anakara Hastanesi";
        //dok1.SicilNo private

        Doctor dok2=new Doctor("Mehnet");


    }
}
