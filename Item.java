public class Item {
    private String name;
    private int hp;
    private int exp;
    private String milk;
    private String nut;
    private String meat;

    public Item(String name) {
        this.name = name;
        if (this.name.equals("milk")) {

            hp = 10;
            exp = 0;
        } else if (this.name.equals("nut")) {
            exp = 10;
            hp = 0;
        } else if (this.name.equals("meat")) {
            hp = 10;
            exp = 10;
        }
    }

    public void showName() {

        System.out.println();
        System.out.println("Name : " + this.name);
        System.out.println("Hp : " + this.hp);
        System.out.println("Exp : " + this.exp);
        System.out.println();
    }
}