public class Novice {
    private int exp;
    private int hp;
    private Bag bag;
    private String name;

    public Novice(String value) {
        this.bag = new Bag();
        this.exp = 0;
        this.hp = 0;

    }

    public void increaseEXP(int exp) {
        this.exp = +exp;
    }

    public void increaseHP(int heal) {
        hp = hp + heal;
    }

    public void decreaseHP(int damage) {
        hp = hp - damage;
    }

    public void showInfo() {
        System.out.println();
        System.out.println("Exp = " + this.exp);
        System.out.println("HP = " + this.hp);
        System.out.println("-------------------------");

    }

    public void addItem(String itemName) {
        this.bag.addItem(itemName);
    }

    public void showItem() {
        this.bag.showItem();
        System.out.println();
    }

    public int allEXP(int exp) {
        return exp = 0;
    }

    public int thiefHP(int heal) {
        return hp = 500;
    }
}

class Thief extends Novice {

    public Thief(String name) {
        super(name);
    }
}

class Magicion extends Novice {

    public Magicion(String name) {
        super(name);
    }
}