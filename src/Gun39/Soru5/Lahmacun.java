package Gun39.Soru5;

public class Lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("Nesif lahmacunlarimiz afiyetler ");
    }

    @Override
    public double ucret() {
        return 33;
    }
    void dough(){
        System.out.println("Incecik hamurumuz acildi");
    }void addMeat(){
        System.out.println("Enfes kiymamiz eklendi");
    }
    void bake(){
        System.out.println("Pisirildi");

    }
}
