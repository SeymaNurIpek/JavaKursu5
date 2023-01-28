package Odevler.Odev3;

public class Samsung extends Phone{
    @Override
    void options(String s3, String s4) {
        switch (s3){
            case "256 GB ve 5.5 inch":
                Phone.cart.add("$1000");
                break;
            case "256 GB ve 7.5 inch":
                Phone.cart.add("$1200");
                break;
            case "512 GB ve 5.5 inch":
                Phone.cart.add("$1300");
                break;
            case "512 GB ve 6.5 inch":
                Phone.cart.add("$1400");
                break;
            default:
                break;
        }

    }
}
