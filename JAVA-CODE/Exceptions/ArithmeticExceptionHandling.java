public class ArithmeticExceptionHandling {

    public static void main(String[] args) {
        divideNumbers(10, 2);  // Should print the result and "Operation complete."
        divideNumbers(10, 0);  // Should catch division by zero error
        divideNumbers(10, null);  // Should catch NullPointerException
    }

    public static void divideNumbers(Integer num1, Integer num2) {
        try {
            // Try to perform division
            int result = num1 / num2;
            System.out.println("The result of " + num1 + " divided by " + num2 + " is " + result + ".");
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NullPointerException e) {
            // Handle null pointer exception
            System.out.println("Error: One of the inputs is null.");
        } finally {
            // This block always runs, regardless of exceptions
            System.out.println("Operation complete.");
        }
    }
}
