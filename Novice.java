public class Novice {
    private int exp;
    private int hp;
    private Bag bag;
    private String name;
    private int level;
    private int maxHp;
    private int maxExp;
    private boolean dead;

    public Novice(String value) {
        this.bag = new Bag();
        this.exp = 0;
        this.hp = 100;
        this.maxHp = 100;
        this.maxExp = 5;
        this.level = 1;
        this.name = value;
        this.dead = false;
    }

    public boolean getDead() {
        return dead;
    }

    public Bag getBag() {
        return bag;
    }

    public void increaseEXP(int exp) {
        this.exp += exp;
        while (this.exp >= maxExp) {
            this.exp = this.exp - maxExp;
            levelUp();
        }
    }

    public boolean increaseHP(int heal) {
        if (hp < maxHp) {
            hp = hp + heal;
            return true;
        } else {
            return false;
        }
    }

    public void decreaseHP(int damage) {
        hp = hp - damage;
        if (hp <= 0) {
            dead = true;
        }
    }

    public void levelUp() {
        level = level + 1;
        maxExp = maxExp + 5;
        hp = maxHp = maxHp + 10;
    }

    public void showInfo() {
        System.out.println("Name = " + this.name);
        System.out.println("Level = " + this.level);
        System.out.println("Exp = " + this.exp + "/" + this.maxExp);
        System.out.println("HP = " + this.hp + "/" + this.maxHp);
        System.out.println("-------------------------");

    }

    public void showItem() {
        System.out.println();
        System.out.println(bag.nut.getName() + "(" + bag.nut.getHp() + ") : " + bag.nut.getNumber());
        System.out.println(bag.milk.getName() + "(" + bag.milk.getHp() + ") : " + bag.milk.getNumber());
        System.out.println(bag.meat.getName() + "(" + bag.meat.getHp() + ") : " + bag.meat.getNumber());
        System.out.println();
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