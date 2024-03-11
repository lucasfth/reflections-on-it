public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("False");
            System.exit(1);
        }
        String input = args[0];
        int zero = 0;
        int one = 0;
        boolean isOnes = false;

        for(char c : input.toCharArray()) {
            if (c == '0' && !isOnes) { zero ++; }
            else if (c == '1') {
                one ++;
                isOnes = true;
            }
            else {
                System.out.println("False");
                System.exit(1);
            }
        }
        if (zero == one) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
