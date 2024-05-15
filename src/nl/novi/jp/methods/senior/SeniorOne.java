package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.List;


/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class SeniorOne {
    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

        convertNames(curstomerNames);
    }

    public static void convertNames(List<String> names) {
        for (String name : names) {

            int indexSpace = name.indexOf(" ");
            int lastIndexSpace = name.lastIndexOf(" ");
            String changeFirstName = name.substring(0,1).toUpperCase() + name.substring(1,indexSpace);
            String changeLastName;
            if(name.contains("-")) {
                int hyphenIndex = name.indexOf("-");
                changeLastName =
                                name.substring(indexSpace+1,hyphenIndex+1) +
                                name.substring(hyphenIndex+1,hyphenIndex+2).toUpperCase() +
                                name.substring(hyphenIndex+2);
            } else if( indexSpace != lastIndexSpace) {
                changeLastName =
                                name.substring(indexSpace+1,lastIndexSpace+1) +
                                name.substring(lastIndexSpace+1,lastIndexSpace+2).toUpperCase() +
                                name.substring(lastIndexSpace+2);
            }
            else {
                changeLastName =
                                name.substring(indexSpace+1,indexSpace+2).toUpperCase() +
                                name.substring(indexSpace+2);
            }
            String fullNameChanged = changeFirstName + " " + changeLastName;
            System.out.println(fullNameChanged);
        }
    }
}
