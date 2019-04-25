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
        Novice novice = new Novice(name, "Novice", 100);

        funrun = true;
        run = true;
        System.out.println("Select your charecter");
        System.out.println("Enter 1 : Lion");
        System.out.println("Enter 2 : Tiger");
        int Select = input.nextInt();
        if (Select == 1) {
            Lion lion = new Lion(name);
            novice = lion;
        } else if (Select == 2) {
            Tiger tiger = new Tiger(name);
            novice = tiger;
        }
        while (funrun) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("Enter 1 : Novice");
            System.out.println("Enter 2 : Show My Items");
            System.out.println("Enter 3 : Use Items");
            System.out.println("Enter 4 : Attack Monters");
            System.out.println("Enter 0 : Exit");
            System.out.println();

            System.out.print("Please Enter the number: ");
            int enter = input.nextInt();

            if (enter == 1) {
                // novice.showInfo();
            }
            if (enter == 2) {
                System.out.println("Items in my bag : ");
                // novice.showItem();

            }
            if (enter == 3) {

                System.out.println("Enter 1 : use Meat");
                System.out.println("Enter 2 : use Nut");
                System.out.println("Enter 3 : use Milk");
                System.out.print("Please Enter the number: ");
                int key = input.nextInt();

                if (key == 1) {
                    if (novice.increaseHP(novice.getBag().squirrelMeat.getHp())) {
                        novice.getBag().squirrelMeat.setNumber(-1);
                    }
                }
                if (key == 2) {
                    if (novice.increaseHP(novice.getBag().rabbitMeat.getHp())) {
                        novice.getBag().rabbitMeat.setNumber(-1);
                    }
                }
                if (key == 3) {
                    if (novice.increaseHP(novice.getBag().hamsterMeat.getHp())) {
                        novice.getBag().hamsterMeat.setNumber(-1);
                    }
                }
                if (key == 0) {
                    run = false;
                    System.out.println("Exit");
                }
            }
            if (enter == 4) {

                System.out.println("Enter 1 : Attack squirrel");
                System.out.println("Enter 2 : Attack rabbit");
                System.out.println("Enter 3 : Attack hamster");
                System.out.print("Please Enter the number: ");
                int key = input.nextInt();

                if (key == 1) {
                    novice.decreaseHP(ml.getMonters(0).getDamage());
                    novice.increaseEXP(ml.getMonters(0).getExp());
                    novice.getBag().squirrelMeat.setNumber(1);
                }
                if (key == 2) {
                    novice.decreaseHP(ml.getMonters(1).getDamage());
                    novice.increaseEXP(ml.getMonters(1).getExp());
                    novice.getBag().rabbitMeat.setNumber(1);
                }
                if (key == 3) {
                    novice.decreaseHP(ml.getMonters(2).getDamage());
                    novice.increaseEXP(ml.getMonters(2).getExp());
                    novice.getBag().hamsterMeat.setNumber(1);
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