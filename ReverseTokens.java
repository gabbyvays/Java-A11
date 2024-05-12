import java.util.Scanner;

public class ReverseTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");

        String inputLine = scanner.nextLine();

        String[] tokens = inputLine.split(" ");

        System.out.println("Tokens in reverse order:");

        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.print(tokens[i]);

            if (i > 0) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
