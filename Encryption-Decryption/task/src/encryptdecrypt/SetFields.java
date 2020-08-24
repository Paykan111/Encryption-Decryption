package encryptdecrypt;

public class SetFields {

    String[] args;
    String action = "enc";
    String alg = "shift";
    int key = 0;
    String data = null;
    String out = null;
    String in = null;

    SetFields(String[] args) {
        this.args = args;
        set(args);
    }

    void set(String[] args) {
        for (int i = 1; i < args.length; i++) {
            switch (args[i - 1]) {
                case "-mode":
                    this.action = args[i];
                    break;
                case "-key":
                    this.key = Integer.parseInt(args[i]);
                    break;
                case "-data":
                    this.data = args[i];
                    break;
                case "-out":
                    this.out = args[i];
                    break;
                case "-in":
                    this.in = args[i];
                    break;
                case "-alg":
                    this.alg = args[i];
                    break;
                default:
                    break;
            }
        }
    }

    public String getAction() {
        return this.action;
    }

    public int getKey() {
        return this.key;
    }

    public String getData() {
        return this.data;
    }

    public String getOut() {
        return this.out;
    }

    public String getIn() {
        return this.in;
    }

    public String getAlg() {
        return this.alg;
    }
}
