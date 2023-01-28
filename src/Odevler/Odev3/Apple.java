package Odevler.Odev3;

public class Apple extends Phone{
    @Override
    void options(String s1, String s2) {
        switch (s1){
            case "64 GB ve 5.5 inch":
                Phone.cart.add("$750");
                break;
            case "64 GB ve 6.5 inch":
                Phone.cart.add("$850");
                break;
            case "128 GB ve 5.5 inch":
                Phone.cart.add("$950");
                break;
            case "128 GB ve 6.5 inch":
                Phone.cart.add("$1200");
                break;
            default:
                break;
        }
    }
}
