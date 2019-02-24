import java.util.Scanner;

public class Maingame {

    public static void main(String[] args) {
        Boolean funrun;

        Boolean run;
        Scanner input = new Scanner(System.in);
        Novice novice = new Novice("100");

        System.out.print("Please Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome" + " " + name);

        funrun = true;
        run = true;
        System.out.println("Select your job");
        System.out.println("Enter 1 : Magicion");
        System.out.println("Enter 2 : Thief");
        int Select = input.nextInt();
        if (Select == 1) {
            Magicion magicion = new Magicion("Magicion");
        } else if (Select == 2) {
            Thief thief = new Thief("Thief");
        }
        while (funrun) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("Enter 1 : Novice");
            System.out.println("Enter 2 : add Items");
            System.out.println("Enter 3 : show My Items");
            System.out.println("Enter 0 : Exit");
            System.out.println();

            System.out.print("Please Enter the number: ");
            int enter = input.nextInt();

            if (enter == 1) {
                novice.showInfo();
            }
            if (enter == 2) {

                System.out.println("Enter 1 : add Meat");
                System.out.println("Enter 2 : add Nut");
                System.out.println("Enter 3 : add Milk");
                System.out.print("Please Enter the number: ");
                int key = input.nextInt();

                if (key == 1) {
                    novice.addItem("meat");
                }
                if (key == 2) {
                    novice.addItem("nut");
                }
                if (key == 3) {
                    novice.addItem("milk");
                }
                if (key == 0) {
                    run = false;
                    System.out.println("Exit");
                }

            }
            if (enter == 3) {
                System.out.println("Items in my bag : ");
                novice.showItem();

            }
            if (enter == 0) {
                funrun = false;
                System.out.println();
                System.out.print("Good Bye");
            }

        }
    }
}