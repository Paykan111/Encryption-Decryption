import static java.lang.Integer.parseInt;

/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        int result = 0;
        int forLoop;
        switch (operator) {
            case "MAX":
                for (int i = 1; i < args.length; i++) {
                    forLoop = (int) parseInt(args[i]);
                    if (forLoop > result) result = forLoop;
                }
                break;
            case "MIN":
                result = (int) parseInt(args[1]);
                for (int i = 2; i < args.length; i++) {
                    forLoop = (int) parseInt(args[i]);
                    if (forLoop < result) result = forLoop;
                }
                break;
            case "SUM":
                for (int i = 1; i < args.length; i++) {
                    forLoop = (int) parseInt(args[i]);
                    result += forLoop;
                }
                break;
            default:
                break;
        }
        System.out.println(result);
    }
}