package encryptdecrypt;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SetFields setFields = new SetFields(args);      //New object for setting our fields
        final String action = setFields.getAction();
        final int key = setFields.getKey();
        final String out = setFields.getOut();
        final String in = setFields.getIn();
        final String alg = setFields.getAlg();
        String data = setFields.getData();
        String result = "";                             //Result line

        if (data == null && in == null) {
            System.exit(0);
        }
        if (data == null) data = dataFromInput(in);
        if (key == 0) result += data;
        else {                                          //choose algorithm
            if (alg.equals("unicode")) {
                Unicode unicode = new Unicode();
                result += unicode.unicoder(data, action, key);
            } else {
                Shift shift = new Shift();
                result += shift.cipher(data, action, key);
            }
        }
        if (out == null) System.out.println(result);       //Output result line
        else dataToFile(out, result);
    }

    static void dataToFile(String out, String result) {     //Writes data to the file from String "out"
        try (FileWriter writer = new FileWriter(out, false)) {  //only our text in file
            writer.write(result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    static String dataFromInput(String in) {        //Reads data from the input String "in" file
        String resultInput = null;
        try {
            File file = new File(in);
            Scanner forFile = new Scanner(file);
            resultInput = forFile.nextLine();
            forFile.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return resultInput;
    }
}