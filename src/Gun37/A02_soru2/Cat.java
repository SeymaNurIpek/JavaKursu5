package Gun37.A02_soru2;

public class Cat extends Animal implements IAnimal{
    public Cat(String turu, String renk) {
        super(turu, renk);
    }

    @Override
    public String food() {
        return "Mama yer";
    }
}
