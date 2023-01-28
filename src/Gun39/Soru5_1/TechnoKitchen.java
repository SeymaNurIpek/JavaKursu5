package Gun39.Soru5_1;

public class TechnoKitchen {
    public static void hazirla(IFood f){
        if (f instanceof AdanaKebap){
            ((AdanaKebap)f).marina();
            ((AdanaKebap)f).grill();
           
            
        }else
        if (f instanceof Lahmacun){
            ((Lahmacun)f).aadMeat();
            ((Lahmacun)f).bake();
            ((Lahmacun)f).dough();

        } else if (f instanceof Borsh ) {
            ((Borsh)f).boil();
            ((Borsh)f).eatTomarrrow();

        } else if (f instanceof Palov) {
            ((Palov)f).boil();
            ((Palov)f).fry();
        }
        f.taste();
        f.ucret();
        System.out.println("*****");
    }
}
