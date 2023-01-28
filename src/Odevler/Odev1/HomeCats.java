package Odevler.Odev1;

import Odevler.Odev1.Cats;

public  class HomeCats extends Cats {
    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void talk() {
        System.out.println("Home Cat is talking");
    }
}
