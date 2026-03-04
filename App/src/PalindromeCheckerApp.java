import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input : ");
                String input = scanner.nextLine();

                long startTime = System.nanoTime();

                boolean result = isPalindrome(input);

                long endTime = System.nanoTime();
                long executionTime = endTime - startTime;

                System.out.println("Is Palindrome? : " + result);
                System.out.println("Execution Time : " + executionTime + " ns");
            }

            private static boolean isPalindrome(String input) {

                if (input == null) {
                    return false;
                }

                String normalized = input.toLowerCase();

                int start = 0;
                int end = normalized.length() - 1;

                while (start < end) {
                    if (normalized.charAt(start) != normalized.charAt(end)) {
                        return false;
                    }
                    start++;
                    end--;
                }

                return true;
            }
        }