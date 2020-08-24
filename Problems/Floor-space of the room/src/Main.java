import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        double result = 0;
        double a;
        double b;
        double c;
        double r;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        switch (str) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                result = triangle(a, b, c);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = rectangle(a, b);
                break;
            case "circle":
                r = scanner.nextDouble();
                result = circle(r);
                break;
            default:
                break;
        }
        System.out.println(result);
    }

    public static double triangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double rectangle(double a, double b) {
        return a * b;
    }

    public static double circle(double r) {
        double pi = 3.14;
        return pi * r * r;
    }
}