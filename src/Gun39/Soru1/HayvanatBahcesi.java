package Gun39.Soru1;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kd=new Kedi("Kopuk",false,"01/01/2015");
      // System.out.println("kd = " + kd);
        kd.guzelYaz();
        System.out.println("****************");
        Kartal k=new Kartal("Kara Kartal",true,"02/02/2017") ;
       // System.out.println("k = " + k);
        k.guzelYaz();

    }
}
