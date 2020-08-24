import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            try {
                int i = Integer.parseInt(s);
                if (i == 0) break;
                System.out.println(i * 10);
            } catch (Exception exception) {
                System.out.println("Invalid user input: " + s);
            }
        }
    }
}