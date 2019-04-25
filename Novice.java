public class Novice {
    private int exp;
    private int hp;
    private Bag bag;
    private String name;
    private String type;
    private int killMon;
    private int level;
    private int maxHp;
    private int maxExp;
    private boolean dead;

    public Novice(String value, String type, int hp) {
        this.bag = new Bag();
        this.killMon = 0;
        this.exp = 0;
        this.hp = hp;
        this.type = type;
        this.maxHp = hp;
        this.maxExp = 5;
        this.level = 1;
        this.name = value;
        this.dead = false;
    }

    public boolean getDead() {
        return dead;
    }

    public int getKillMon() {
        return killMon;
    }

    public void setKillMon() {
        this.killMon += 1;
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

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

}

class Lion extends Novice {

    public Lion(String name) {
        super(name, "Lion", 150);
    }
}

class Tiger extends Novice {

    public Tiger(String name) {
        super(name, "Tiger", 100);
    }
}