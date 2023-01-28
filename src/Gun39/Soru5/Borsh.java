package Gun39.Soru5;

public class Borsh implements IFood{
    @Override
    public void taste() {
        System.out.println("Nesfis Borsh");
    }

    @Override
    public double ucret() {
        return 33;
    }
    void boil(){
        System.out.println("Corbamiz Kayniyor");
    }
    void eatTomorrow(){
        System.out.println("Et ve sebzeler ile hazir");

    }
}
