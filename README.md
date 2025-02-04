# Unexpected Variable Modification in Finally Block After Exception

This Java program demonstrates a subtle bug related to unexpected variable modification within a `finally` block after an exception has been handled.

The code attempts to divide 10 by 0, resulting in an `ArithmeticException`.  While the exception is handled, the `finally` block modifies the variable 'x', which might not be expected behavior in all cases. This could lead to unexpected results or logical errors in larger applications if not carefully considered.

The solution demonstrates how to address the issue and manage the situation better.