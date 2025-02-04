public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y; // potential ArithmeticException
            System.out.println(z); 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } finally {
            //This line will always execute regardless of exception
            System.out.println("This always executes");
            //Introducing a bug here, modifying x which might be unexpected after exception handling
            x = 20; 
        }
        System.out.println(x); //prints 20, not 10 as one might expect
    }
}