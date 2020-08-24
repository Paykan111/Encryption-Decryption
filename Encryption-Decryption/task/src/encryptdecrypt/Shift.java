package encryptdecrypt;

public class Shift {

    String cipher(String data, String action, int key) {
        switch (action) {
            case "enc":
                return encryption(data, key);
            case "dec":
                return decryption(data, key);
            default:
                throw new IllegalArgumentException("Something wrong here: " + action);
        }
    }

    private String decryption(String data, int key) {
        return encryption(data, 26 - (key % 26));
    }

    private String encryption(String data, int key) {
        String result = "";
        for (char character : data.toCharArray()) {
            if (character != ' ' && character != '!') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                result += (char) ('a' + newAlphabetPosition);
            } else {
                result += character;
            }
        }
        return result;
    }
}