//finally block will always execute after a try block, even if no error, or if return statement

public class LearnFinally {
    public static void main(String args[]) {
        try {
            System.out.println("First statement of try block");
            int num = 45 / 5;
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("I caught Exception");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("Main method");
    }
}
