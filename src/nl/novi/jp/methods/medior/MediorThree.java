package nl.novi.jp.methods.medior;
import java.util.ArrayList; // import the ArrayList class

/**
 * Gegeven: Een methode waarin je een string kunt stoppen. Deze methode transformeert de String op zo'n manier dat
 * alleen de eerste letter een hoofdletter is.
 *
 * De methode wordt echter nog niet gebruikt voor printName(), waardoor de namen nu allemaal rare hoofdletters hebben.
 *
 * Los dit op!
 */
public class MediorThree {

    public static void main(String[] args) {
        printName("SjAaK", "Patat");
        printName("henk","spaghetti");
        printName("Doerak", "BELL");
    }

    public static void printName(String firstName, String lastName) {
        System.out.println("Naam: " + firstLetterToUpperCase(firstName) + " " + firstLetterToUpperCase(lastName));
    }

    public static String firstLetterToUpperCase(String name) {
        // Je hoeft niet te weten wat toLowerCase(), toUpperCase() en substring() doen,
        // maar het is een goed idee om dit op te zoeken als je toch nieuwsgierig bent.
        String transformedName = name.toLowerCase();
        transformedName = transformedName.substring(0,1).toUpperCase() + transformedName.substring(1);

        return transformedName;
    }

}
