package Gun39.Soru5;

public class AdanaKebap implements IFood{
    @Override
    public void taste() {
        System.out.println("Mukemmel kebab lezzeti: Adana Kebap");
    }

    @Override
    public double ucret() {
        return 55;
    }
    void  marinade(){
        System.out.println("Marina edildi");
    }
    void  grill(){
        System.out.println("Izgarada");
    }
}
