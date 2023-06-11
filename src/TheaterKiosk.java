import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int personAge = 0;

        System.out.print("Enter your age: ");

        personAge = in.nextInt();
        in.nextLine();

        if(personAge >= 21){
            System.out.println("You get a wrist band!");
        }

    }
}