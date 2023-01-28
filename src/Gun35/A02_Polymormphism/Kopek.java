package Gun35.A02_Polymormphism;

public class Kopek extends Hayvan {
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Havladi");
    }
    public void kokladi() {
        System.out.println("tirmaladi");
    }
}
