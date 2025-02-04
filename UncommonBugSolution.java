public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y; // potential ArithmeticException
            System.out.println(z); 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } finally {
            //Avoid modifying x in finally block unless absolutely necessary, or handle it more thoughtfully
            System.out.println("This always executes");
        }
        System.out.println(x); //prints 10 as expected
    }
}