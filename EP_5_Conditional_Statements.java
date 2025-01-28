public class EP_5_Conditional_Statements {
    public static void main(String[] args){

        // if statement:

        int num = 5;
        if(num<0){
            System.out.println(num);
        }


        // if else statement:

        int age = 17;

        if(age >= 18){
            System.out.println(age);
        }
        else{
            System.out.println("underage");
        }

        // if else-if else statement:

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        if(n1>n2 && n1>n3){
            System.out.println(n1 + "largest");
        }
        else if(n2>n3){
            System.out.println(n2 + "largest");
        }
        else{
            System.out.println(n3 + "largest");
        }

        // Ternary operator

        int n =4;
        int result = 0;

        result = n%2==0 ? 10  : 20 ;

        System.out.println(result);
    }

}
