class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandler {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; // ArithmeticException

            String str = null;
            System.out.println(str.length()); // NullPointerException

            throw new CustomException("This is a custom exception"); // Custom exception
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException => " + e.getMessage());
        } catch (CustomException e) {
            System.out.println("CustomException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
    }
}