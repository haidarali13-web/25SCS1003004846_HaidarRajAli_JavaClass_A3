//E-mail Address input

import java.util.Scanner;

public class Emailaddressinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);

        sc.close();
    }
}