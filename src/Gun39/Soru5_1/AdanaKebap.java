package Gun39.Soru5_1;

public class AdanaKebap implements IFood {
    @Override
    public void taste() {
        System.out.println("Etin en guzel hallerinden biri");
    }

    @Override
    public double ucret() {
        return 75;
    }
    void marina(){
        System.out.println("Et dunden ozel baharatlarla terbiye edildi");
    }
    void grill(){
        System.out.println("Komur atesinde yavas yavas pisirildi");
    }
}
