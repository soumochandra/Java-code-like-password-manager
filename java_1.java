


//Create a locker where only
//one can find details after 
//giving the proper password

import java.util.Scanner;

public class java_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number;
            do {
                System.out.print("Input password: ");
                number = sc.nextInt();
                if (number != 9748) {
                    System.out.println("Wrong Password");
                }
            } while (number != 9748);

            // Print details after correct password
            System.out.println("Account No : 0001452417885");
            System.out.println("IFSC Code : 00DHB2004");
            System.out.println("Pass Code : vata@2004");
            System.out.println("Address : 1/2A, Chadpur Lane");
            System.out.println("City : Kolkata");
            System.out.println("Property No : 0000-9847-1A45");
            System.out.println("Property Code : 98DAD578");
        }
    }
}
