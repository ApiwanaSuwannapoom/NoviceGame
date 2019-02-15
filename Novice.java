public class Novice {
    private int level;
    private int exp;
    private int hp;
    private Bag bag;
    private String name;

    public Novice(String value) {
        this.bag = new Bag();
        this.name = "Mario";
        this.level = 1;
        this.exp = 0;
        this.hp = 0;

    }

    public void upgradeExp() {
        exp = this.exp + 1;
        // System.out.println("Exp = " + this.exp);
    }

    public void upgradelevel() {
        level = this.level + 1;
        // System.out.println("Level = " + this.level);
    }

    public void upgradeHp() {
        hp = this.hp + 20;
        // System.out.println("HP = " + this.hp);
    }

    public void showInfo() {
        Novice novice = new Novice("100");
        System.out.println();
        System.out.println("Name = " + this.name);
        System.out.println("Level = " + this.level);
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

}