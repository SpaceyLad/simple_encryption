import java.util.ArrayList;
import java.util.Locale;

public class Encrypt{

    int publicKey = 20;
    int privateKey = 110;

    public void toNr(ArrayList iM){
        Decrypt dE = new Decrypt();
        ArrayList sE = new ArrayList();

        for (Object o : iM) {
            String part1 = String.valueOf(o);
            int part2 = rules(part1);
            int part3 = part2 * publicKey;
            int part4 = part3 * publicKey;
            int part5 = part4 + privateKey;
            sE.add(part5);
        }
        System.out.println("Encrypted message:\n"+sE+"\n");
        dE.de(sE);
    }
    public int rules(String x){
        if(x.toLowerCase(Locale.ROOT).equals("a")){
            return 1;
        }
        if(x.toLowerCase(Locale.ROOT).equals("b")){
            return 2;
        }
        if(x.toLowerCase(Locale.ROOT).equals("c")){
            return 3;
        }
        if(x.toLowerCase(Locale.ROOT).equals("d")){
            return 4;
        }
        if(x.toLowerCase(Locale.ROOT).equals("e")){
            return 5;
        }
        if(x.toLowerCase(Locale.ROOT).equals("f")){
            return 6;
        }
        if(x.toLowerCase(Locale.ROOT).equals("g")){
            return 7;
        }
        if(x.toLowerCase(Locale.ROOT).equals("h")){
            return 8;
        }
        if(x.toLowerCase(Locale.ROOT).equals("i")){
            return 9;
        }
        if(x.toLowerCase(Locale.ROOT).equals("j")){
            return 10;
        }
        if(x.toLowerCase(Locale.ROOT).equals("k")){
            return 11;
        }
        if(x.toLowerCase(Locale.ROOT).equals("l")){
            return 12;
        }
        if(x.toLowerCase(Locale.ROOT).equals("m")){
            return 13;
        }
        if(x.toLowerCase(Locale.ROOT).equals("n")){
            return 14;
        }
        if(x.toLowerCase(Locale.ROOT).equals("o")){
            return 15;
        }
        if(x.toLowerCase(Locale.ROOT).equals("p")){
            return 16;
        }
        if(x.toLowerCase(Locale.ROOT).equals("q")){
            return 17;
        }
        if(x.toLowerCase(Locale.ROOT).equals("r")){
            return 18;
        }
        if(x.toLowerCase(Locale.ROOT).equals("s")){
            return 19;
        }
        if(x.toLowerCase(Locale.ROOT).equals("t")){
            return 20;
        }
        if(x.toLowerCase(Locale.ROOT).equals("u")){
            return 21;
        }
        if(x.toLowerCase(Locale.ROOT).equals("v")){
            return 22;
        }
        if(x.toLowerCase(Locale.ROOT).equals("w")){
            return 23;
        }
        if(x.toLowerCase(Locale.ROOT).equals("x")){
            return 24;
        }
        if(x.toLowerCase(Locale.ROOT).equals("y")){
            return 25;
        }
        if(x.toLowerCase(Locale.ROOT).equals("z")){
            return 26;
        }
        if(x.toLowerCase(Locale.ROOT).equals("0")){
            return 27;
        }
        if(x.toLowerCase(Locale.ROOT).equals("1")){
            return 28;
        }
        if(x.toLowerCase(Locale.ROOT).equals("2")){
            return 29;
        }
        if(x.toLowerCase(Locale.ROOT).equals("3")){
            return 30;
        }
        if(x.toLowerCase(Locale.ROOT).equals("4")){
            return 31;
        }
        if(x.toLowerCase(Locale.ROOT).equals("5")){
            return 32;
        }
        if(x.toLowerCase(Locale.ROOT).equals("6")){
            return 33;
        }
        if(x.toLowerCase(Locale.ROOT).equals("7")){
            return 34;
        }
        if(x.toLowerCase(Locale.ROOT).equals("8")){
            return 35;
        }
        if(x.toLowerCase(Locale.ROOT).equals("9")){
            return 36;
        }
        if(x.toLowerCase(Locale.ROOT).equals("_")){
            return 37;
        }
        if(x.toLowerCase(Locale.ROOT).equals("{")){
            return 38;
        }
        if(x.toLowerCase(Locale.ROOT).equals("}")){
            return 39;
        }
        if(x.toLowerCase(Locale.ROOT).equals("<")){
            return 40;
        }
        if(x.toLowerCase(Locale.ROOT).equals(">")){
            return 41;
        }
        return 0;
    }
}
