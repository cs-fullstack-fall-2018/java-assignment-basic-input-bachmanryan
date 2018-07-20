//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("It's a great day today!");
//        System.out.print("What is your name? ");
//        Scanner scanIn = new Scanner(System.in);
//        String name = scanIn.nextLine();
//        System.out.println("Hello " + name);
//
//    }
//}



//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args)
//    {   System.out.print("Enter a number: ");
//        Scanner scanIn = new Scanner(System.in);
//        int num1 = scanIn.nextInt();
//
//        System.out.print("Enter another number: ");
//        scanIn = new Scanner(System.in);
//        int num2 = scanIn.nextInt();
//
//        System.out.println("Sum: "+ (num1 + num2));
//    }
//}



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter your balance: ");
        Scanner scanIn = new Scanner(System.in);
        int balance = scanIn.nextInt();

        System.out.print("I've added $2 to your account");
        //scanIn = new Scanner(System.in);
        int newBalance = scanIn.nextInt();


    }
}