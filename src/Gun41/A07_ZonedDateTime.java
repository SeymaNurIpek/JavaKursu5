package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class A07_ZonedDateTime {
    public static void main(String[] args) {
        //Baska zaman bolgelerinin(time zone) zaman bilgisini alma

        ZonedDateTime zdt=ZonedDateTime.now();
        
        // suanda benum bulundugum default zamani verdi
        System.out.println("zdt = " + zdt);

       Set<String >zamanBolgeleri= ZoneId.getAvailableZoneIds();
        for (String z:zamanBolgeleri) {
            if (z.toLowerCase().contains("turk"))
            System.out.println("z = " + z);
        }

        ZoneId zoneIdTurkey=ZoneId.of("Turkey");
        ZonedDateTime zoneTurkey=ZonedDateTime.now(zoneIdTurkey);
        System.out.println("zoneTurkey = " + zoneTurkey);

        ZoneId zoneIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime saatLondon=ZonedDateTime.now(zoneIdLondon);
        System.out.println("saatLondon = " + saatLondon);
        
    }
}
