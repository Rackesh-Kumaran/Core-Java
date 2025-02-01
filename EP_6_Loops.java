public class EP_6_Loops {
    public static void main(String[] args){

        // Program to print numbers from 1 to 5

        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println(i);        // op = 1,2,3,4,5
        }


        // Java for-each Loop :

        // create an array
        int[] numbers = {3, 7, 5, -5};

        // iterating through the array
        for (int number: numbers) {
            System.out.println(number);  // op = 3,7,5,-5
        }


        // While loop :

        // declare variables
        int i = 1, n1 = 5;

        // while loop from 1 to 5
        while(i <= n1) {
            System.out.println(i);
            i++;                        // op = 1,2,3,4,5
        }

        // do-while loop :

        int d = 1, N = 5;

        // do...while loop from 1 to 5
        do {
            System.out.println(i);
            d++;
        } while(d <= N);    // op = 1,2,3,4,5








    }
}
