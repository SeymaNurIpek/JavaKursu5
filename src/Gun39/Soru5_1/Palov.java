package Gun39.Soru5_1;

public class Palov implements IFood {
    @Override
    public void taste() {
        System.out.println("Cocuklarin vazgecilmezi");
    }




    @Override
    public double ucret() {
        return 20;
    }void fry(){
        System.out.println("Pirinc ve sehriye kavruldu");
    }void boil(){
        System.out.println("Kisik ateste pisirildi");
    }
}
