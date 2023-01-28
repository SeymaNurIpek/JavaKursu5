package Gun37.A02_soru2;

public class Swallow extends Animal implements IFlying{
    public Swallow(String turu, String renk) {
        super(turu, renk);
    }

    @Override
    public String food() {
        return "Tahil yer";
    }

    @Override
    public String flying() {
        return "nede guzel ucar";
    }
}
