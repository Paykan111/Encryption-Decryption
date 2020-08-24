import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String result = "";
        int max = 0;
        String[] str = scanner.nextLine().split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max) {
                max = str[i].length();
                result = str[i];
            }
        }
        System.out.println(result);
    }
}