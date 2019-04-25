import java.util.Scanner;

public class Maingame {

    public static void main(String[] args) {
        Boolean funrun;
        MontersList ml = new MontersList();
        Boolean run;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome" + " " + name);
        Novice novice = new Novice(name);

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
            System.out.println("Enter 4 : Use Items");
            System.out.println("Enter 5 : Attack Monters");
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
                    novice.getBag().meat.setNumber(1);
                }
                if (key == 2) {
                    novice.getBag().nut.setNumber(1);
                }
                if (key == 3) {
                    novice.getBag().milk.setNumber(1);
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
            if (enter == 4) {

                System.out.println("Enter 1 : use Meat");
                System.out.println("Enter 2 : use Nut");
                System.out.println("Enter 3 : use Milk");
                System.out.print("Please Enter the number: ");
                int key = input.nextInt();

                if (key == 1) {
                    if (novice.increaseHP(novice.getBag().meat.getHp())) {
                        novice.getBag().meat.setNumber(-1);
                    }
                }
                if (key == 2) {
                    if (novice.increaseHP(novice.getBag().nut.getHp())) {
                        novice.getBag().nut.setNumber(-1);
                    }
                }
                if (key == 3) {
                    if (novice.increaseHP(novice.getBag().milk.getHp())) {
                        novice.getBag().milk.setNumber(-1);
                    }
                }
                if (key == 0) {
                    run = false;
                    System.out.println("Exit");
                }
            }
            if (enter == 5) {

                System.out.println("Enter 1 : Attack squirrel");
                System.out.println("Enter 2 : Attack rabbit");
                System.out.println("Enter 3 : Attack hamster");
                System.out.print("Please Enter the number: ");
                int key = input.nextInt();

                if (key == 1) {
                    novice.decreaseHP(ml.getMonters(0).getDamage());
                    novice.increaseEXP(ml.getMonters(0).getExp());
                }
                if (key == 2) {
                    novice.decreaseHP(ml.getMonters(1).getDamage());
                    novice.increaseEXP(ml.getMonters(1).getExp());
                }
                if (key == 3) {
                    novice.decreaseHP(ml.getMonters(2).getDamage());
                    novice.increaseEXP(ml.getMonters(2).getExp());
                }
                if (key == 0) {
                    run = false;
                    System.out.println("Exit");
                }
                if (novice.getDead()) {
                    funrun = false;
                    System.out.println("You Dead!!!");
                    System.out.println("Good Bye");
                }

            }
            if (enter == 0) {
                funrun = false;
                System.out.println();
                System.out.print("Good Bye");
            }

        }
    }
}