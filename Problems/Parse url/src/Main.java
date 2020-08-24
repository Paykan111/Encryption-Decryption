import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder password = new StringBuilder();
        String[] str = scanner.nextLine().split("[=&?]");
        for (int i = 1; i < str.length; i++) {
            if (str[i - 1].equals("pass")) {
                System.out.println("pass : " + str[i]);
                password.append("password : ").append(str[i]);
            }
            if (str[i - 1].equals("port")) {
                System.out.println("port : " + str[i]);
            }
            if (str[i - 1].equals("name")) {
                System.out.println("name : " + str[i]);
            }
            if (str[i - 1].equals("cookie")) {
                if (str[i].equals("")) {
                    System.out.println("cookie : not found");
                } else {
                    System.out.println("cookie : " + str[i]);
                }
            }
            if (str[i - 1].equals("host")) {
                System.out.println("host : " + str[i]);
            }
        }
        if (!password.toString().equals("")) {
            System.out.println(password);
        }
    }
}