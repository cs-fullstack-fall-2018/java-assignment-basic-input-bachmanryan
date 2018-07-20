import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("It's a great day today!");
        System.out.print("What is your name? ");
        Scanner scanIn = new Scanner(System.in);
        String name = scanIn.nextLine();
        System.out.println("Hello " + name);

    }
}



