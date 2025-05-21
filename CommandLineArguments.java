class CheckArgument extends Exception {
    CheckArgument(String message) {
        super(message);
    }
}

public class CommandLineArguments {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Error: At least four arguments are required for solution.");
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);
            int num4 = Integer.parseInt(args[3]);

            int result = num1 * num1 + num2 * num2 + num3 * num3 + num4 * num4;

            System.out.println("Addition of squares of all four elements: " + result);

        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integer arguments.");
        }
    }
}
