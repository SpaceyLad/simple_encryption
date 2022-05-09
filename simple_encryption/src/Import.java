import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Import {

    String file = "Files/example.txt";

    public void imp(){
        Encrypt eN = new Encrypt();
        ArrayList nR = new ArrayList();
        //Turn the numbers into ArrayList
        File read = new File(file);
        Scanner myReader = null;
        try {
            myReader = new Scanner(read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Could not read the file.");
        }
        while (true) {
            assert myReader != null;
            if (!myReader.hasNextLine()) break;
            String data = myReader.nextLine();
            nR.add(data);
        }
        myReader.close();

        System.out.println("Plain text message: \n"+nR+"\n");
        eN.toNr(nR);
    }

}
