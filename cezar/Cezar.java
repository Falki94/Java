package cezar;

/**
 *
 * @author Falki
 */

public class Cezar {

    public static String cypher(String tekst) {
        char[] ca = tekst.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char znak : ca) {
            if (Character.isAlphabetic(znak)) {
                if (znak == 'X') {
                    znak = 'A';
                } else if (znak == 'Y') {
                    znak = 'B';
                } else if (znak == 'Z') {
                    znak = 'C';
                } else {
                    znak =  (char) (znak + 3);
                }
            }
            sb.append(znak);
        }
        return sb.toString();
    }
}
