package nl.novi.jp.methods.junior;


/**
 * Deze klasse bevat al de methode met de naam greetName. Deze methode ontvangt ook een input-parameter. Deze
 * input-parameter moet van het datatype String zijn en we noemen deze "name" binnen de methode.
 * Deze methode print nu, zoals het in main() staat, de tekst "Hello Nova".
 *
 * sayGoodbyeToName() is ook al toegevoegd, maar de body (de code tussen de accolades) is nog niet af. Zorg ervoor dat
 * de methode 'Goodbye Henk' uitprint.
 */
public class JuniorOne {

    public static void main(String[] args) {
        greetName("Nova");
        sayGoodbyeToName("Henk");
    }

    public static void greetName(String name) {
        System.out.println("Hello " + name);
    }

    public static void sayGoodbyeToName(String name) {
        // write your code here
        System.out.println("Goodbye " + name);
    }
}
