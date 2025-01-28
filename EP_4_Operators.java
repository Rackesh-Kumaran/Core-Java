public class EP_4_Operators {
    public static void main(String[] args){


        // Arithmetaic operators :

        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));



        // Assignment Operators :

        int a1 = 4;
        int var;

        // assign value using =
        var = a1;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += a1;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= a1;
        System.out.println("var using *=: " + var);


        // Relational Operators :

        int a2 = 7, b2 = 11;

        // value of a and b
        System.out.println("a is " + a2 + " and b is " + b2);

        // == operator
        System.out.println(a2 == b2);  // false

        // != operator
        System.out.println(a2 != b2);  // true

        // > operator
        System.out.println(a2 > b2);  // false

        // < operator
        System.out.println(a2 < b2);  // true

        // >= operator
        System.out.println(a2 >= b2);  // false

        // <= operator
        System.out.println(a2 <= b2);  // true




        // Logical Operators :

        // &&(AND) operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // ||(OR) operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // !(NOT) operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false



        // Increment & Decrement :

        // declare variables
        int a3 = 12, b3 = 12;
        int result1, result2,result11,result22;

        // original value
        System.out.println("Value of a: " + a3);

        // Pre-increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + b3);

        // Pre-decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);

        // Post-increment operator
        result11 = a++;
        System.out.println("After increment: " + result1);

        // Post-decrement operator
        result22 = b--;
        System.out.println("After decrement: " + result2);



    }
}
