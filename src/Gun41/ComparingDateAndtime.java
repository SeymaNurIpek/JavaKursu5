package Gun41;

import java.time.LocalDate;

public class ComparingDateAndtime {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);
        
        boolean sonraMi=bugun.isAfter(dun);// bugun dunden sonra mi
        System.out.println("sonraMi = " + sonraMi);
        
        boolean onceMi=bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);
        
        boolean esitMi=bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);
        
        
        boolean artikyilMi=bugun.isLeapYear();// bugunu tarihi artik yil mi
        System.out.println("artikyilMi = " + artikyilMi);
        
        
        
    }
}
