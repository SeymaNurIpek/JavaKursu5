package Gun38.Abstract2;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(5,4);
        d.setName("Yeni Dikdortgen ");
        d.ciz();
        System.out.println("d = " + d);
        System.out.println("**************");
        Daire dr=new Daire(4);
        dr.setName("Yeni daire ");
        dr.ciz();
        System.out.println("dr = " + dr);
    }
}
