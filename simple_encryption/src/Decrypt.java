import java.util.ArrayList;

public class Decrypt {

    /*
        Try to edit the keys..
        Give them new values.
        What happens to the decrypted message?
     */
    int publicKey = 20;
    int privateKey = 110;

    public void de(ArrayList sE){
        ArrayList dE = new ArrayList();
        for (Object o : sE) {
            String get = String.valueOf(o);
            int part1 = Integer.parseInt((get));
            int part2 = part1 - privateKey;
            int part3 = part2 / publicKey;
            int part4 = part3 / publicKey;
            String part5 = rules(part4);
            dE.add(part5);
        }
        System.out.println("Decrypted message:\n"+dE+"\n");
    }
    public String rules(int x) {
        if (x == 1) {
            return "a";
        }
        if (x == 2) {
            return "b";
        }
        if (x == 3) {
            return "c";
        }
        if (x == 4) {
            return "d";
        }
        if (x == 5) {
            return "e";
        }
        if (x == 6) {
            return "f";
        }
        if (x == 7) {
            return "g";
        }
        if (x == 8) {
            return "h";
        }
        if (x == 9) {
            return "i";
        }
        if (x == 10) {
            return "j";
        }
        if (x == 11) {
            return "k";
        }
        if (x == 12) {
            return "l";
        }
        if (x == 13) {
            return "m";
        }
        if (x == 14) {
            return "n";
        }
        if (x == 15) {
            return "o";
        }
        if (x == 16) {
            return "p";
        }
        if (x == 17) {
            return "q";
        }
        if (x == 18) {
            return "r";
        }
        if (x == 19) {
            return "s";
        }
        if (x == 20) {
            return "t";
        }
        if (x == 21) {
            return "u";
        }
        if (x == 22) {
            return "v";
        }
        if (x == 23) {
            return "w";
        }
        if (x == 24) {
            return "x";
        }
        if (x == 25) {
            return "y";
        }
        if (x == 26) {
            return "z";
        }
        if (x == 27) {
            return "0";
        }
        if (x == 28) {
            return "1";
        }
        if (x == 29) {
            return "2";
        }
        if (x == 30) {
            return "3";
        }
        if (x == 31) {
            return "4";
        }
        if (x == 32) {
            return "5";
        }
        if (x == 33) {
            return "6";
        }
        if (x == 34) {
            return "7";
        }
        if (x == 35) {
            return "8";
        }
        if (x == 36) {
            return "9";
        }
        if (x == 37) {
            return "_";
        }
        if (x == 38){
            return "{";
        }
        if (x == 39){
            return "}";
        }
        if (x == 40){
            return "<";
        }
        if (x == 41){
            return ">";
        }
        return "Æ";
    }
}
