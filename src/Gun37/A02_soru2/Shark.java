package Gun37.A02_soru2;

import Gun28.Constructor3.A;

public class Shark extends Animal implements ISalling {
    public Shark(String turu, String renk) {
        super(turu, renk);
    }

    @Override
    public String food() {
        return "Balik yer";
    }

    @Override
    public String salling() {
        return "iyi yuzer";
    }
}
