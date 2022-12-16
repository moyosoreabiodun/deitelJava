import java.util.Scanner;

public class DeitelExercises{
    public static void main(String[] args){
        // System.out.printf("%s%n%s%n", "This is a Java ", "program.");
        
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int x = input.nextInt();

        // System.out.println("Enter another number");
        // int y = input.nextInt();

        // System.out.println("And another");
        // int z = input.nextInt();
        // System.out.println("The product is " + (x * y * z));

        // int p = 2 % 2 + 2 * 2 - 2 / 2;
        // System.out.println(p);

        // System.out.printf("*%n**%n***%n****%n*****%n");

        // System.out.print("*");
        // System.out.println("***");
        // System.out.println("*****");
        // System.out.print("****");
        // System.out.println("**");
        int grade = 25;

        // if(grade >= 60){
        //     System.out.println("You passed, baby!");
        // } else{
        //     System.out.println("Sorry to reak your heart but you failed o");
        //     System.out.println("You gas retake the exam");
        // }

        System.out.println(grade >= 60 ? "You passed, baby!" : "You scored " + grade + ",so you failed.");
    
        int product = 3;
        while (product <= 100) {
            product = 3 * product;
        }
        System.out.println(product);

    }
}