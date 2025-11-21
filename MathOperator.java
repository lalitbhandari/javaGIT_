
/**
 * Write a description of class MathOperator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperator
{
    
     
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators (post-increment & pre-increment)
        System.out.println("\nUnary Operators:");
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("After x++ value of x = " + x);
        System.out.println("++x = " + (++x)); // Pre-increment

        // 3. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int y = 20;
        System.out.println("y = " + y);
        y += 5; // y = y + 5
        System.out.println("y += 5: " + y);
        y *= 2; // y = y * 2
        System.out.println("y *= 2: " + y);

        // 4. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // 5. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean p = true;
        boolean q = false;
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));

        // 6. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max value = " + max);
    }}