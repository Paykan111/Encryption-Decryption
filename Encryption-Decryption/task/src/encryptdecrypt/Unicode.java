package encryptdecrypt;

public class Unicode {

    String unicoder(String data, String action, int key) {
        String result = "";
        switch (action) {
            case "enc":
                for (char c : data.toCharArray()) {
                    int index = (int) (c) + key;
                    result += (char) index;
                }
                break;
            case "dec":
                for (char c : data.toCharArray()) {
                    int index = (int) (c) - key;
                    result += (char) index;
                }
                break;
            default:
                break;
        }
        return result;
    }
}
