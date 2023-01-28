package Gun29.A03Protected.Iki;

import Gun29.A03Protected.Bir.Doctor;

import javax.print.Doc;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doctor dok1=new Doctor("Mehmet");
        dok1.hastaneAd="Istanbul Hastanesi";

        //Doctor dok2=new Doctor();
        //default sadece kendi paketi ulasabilir
    }
}
