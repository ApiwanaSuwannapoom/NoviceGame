public class Item {
    public String name;
    public int hp;
    public int exp;
    public String milk;
    public String nut;
    public String meat;

    public Item(String name, int exp, int hp) {
        this.name = name;
        this.exp = exp;
        this.hp = hp;
    }

    public void showName() {

        System.out.println();
        System.out.println("Name : " + this.name);
        System.out.println("Hp : " + this.hp);
        System.out.println("Exp : " + this.exp);
        System.out.println();
    }

    class Milk extends Item {

        public Milk(String name) {
            super(name, 0, 200);
        }
    }

    class Nut extends Item {

        public Nut(String name) {
            super(name, 200, 0);
        }
    }

    class Meat extends Item {

        public Meat(String name) {
            super(name, 200, 200);
        }
    }
}