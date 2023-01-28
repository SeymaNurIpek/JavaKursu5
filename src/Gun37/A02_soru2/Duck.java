package Gun37.A02_soru2;

public class Duck extends Animal implements ISalling,IFlying{
    public Duck(String turu, String renk) {
        super(turu, renk);
    }

    @Override
    public String food() {
        return "et de yer";
    }

    @Override
    public String flying() {
        return "ucabilir";
    }

    @Override
    public String salling() {
        return "yuzebilir";
    }
}
