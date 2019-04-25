import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class MainGameGUI {
    private JFrame screen;
    private JPanel status;
    private Container c;
    private Novice novice;
    private MontersList montersList;
    private String name;

    public MainGameGUI() {
        montersList = new MontersList();
        screen = new JFrame();
        screen.setTitle("Animal World");
        screen.setSize(500, 500);
        screen.setLocationRelativeTo(null);
        screen.setResizable(false);
        screen.setVisible(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = screen.getContentPane();
        c.setLayout(new BorderLayout());
    }

    public void gui() {
        JButton s = new JButton("Status");
        s.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                showStatus();
            }
        });
        JButton showItem = new JButton("Show Item");
        showItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                showItems();
            }
        });
        JButton useItem = new JButton("Use Item");
        useItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                useItems();
            }
        });
        JButton a = new JButton("Attack");
        a.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                attack();
            }
        });
        status = new JPanel();
        status.setLayout(new FlowLayout());
        status.add(s);
        status.add(showItem);
        status.add(useItem);
        status.add(a);
        c.add(status, BorderLayout.CENTER);
        screen.setVisible(true);
    }

    public void checkDead() {
        if (novice.getDead()) {
            JOptionPane.showMessageDialog(null, "You Dead!!!\n Game Over ");
            System.exit(0);
        }
    }

    public void setName() {
        name = JOptionPane.showInputDialog("Enter your name :");
    }

    public void setType() {
        Object[] options = { "Lion", "Tiger" };
        int n = JOptionPane.showOptionDialog(null, "Choose your charector :", "Charector", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (n == 0) {
            novice = new Lion(name);
        } else if (n == 1) {
            novice = new Tiger(name);
        }
    }

    public void showItems() {
        JOptionPane jstatus = new JOptionPane();
        String statusText = novice.getBag().squirrelMeat.getName() + "(" + novice.getBag().squirrelMeat.getHp() + ") : "
                + novice.getBag().squirrelMeat.getNumber() + "\n" + novice.getBag().rabbitMeat.getName() + "("
                + novice.getBag().rabbitMeat.getHp() + ") : " + novice.getBag().rabbitMeat.getNumber() + "\n"
                + novice.getBag().hamsterMeat.getName() + "(" + novice.getBag().hamsterMeat.getHp() + ") : "
                + novice.getBag().hamsterMeat.getNumber();
        JOptionPane.showMessageDialog(jstatus, statusText, "Status", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showStatus() {
        JOptionPane jstatus = new JOptionPane();
        String statusText = "Name = " + novice.getName() + "\n" + "Type = " + novice.getType() + "\n" + "Level = "
                + novice.getLevel() + "\n" + "Exp = " + novice.getExp() + "/" + novice.getMaxExp() + "\n" + "HP = "
                + novice.getHp() + "/" + novice.getMaxHp() + "\n" + "Kill Monsters:" + novice.getKillMon();
        JOptionPane.showMessageDialog(jstatus, statusText, "Status", JOptionPane.INFORMATION_MESSAGE);
    }

    public void useItems() {
        Object[] options = { "Squirrel Meat", "Rabbit Meat", "Hamster Meat" };
        String n = (String) JOptionPane.showInputDialog(null, "Choose your items :", "Items", JOptionPane.PLAIN_MESSAGE,
                null, options, "Squirrel Meat");
        if (n == "Squirrel Meat") {
            if (novice.increaseHP(novice.getBag().squirrelMeat.getHp())) {
                novice.getBag().squirrelMeat.setNumber(-1);
            }
        } else if (n == "Rabbit Meat") {
            if (novice.increaseHP(novice.getBag().rabbitMeat.getHp())) {
                novice.getBag().rabbitMeat.setNumber(-1);
            }
        } else if (n == "Hamster Meat") {
            if (novice.increaseHP(novice.getBag().hamsterMeat.getHp())) {
                novice.getBag().hamsterMeat.setNumber(-1);
            }
        }
    }

    public void attack() {
        Object[] options = { "Squirrel", "Rabbit", "Hamster" };
        String n = (String) JOptionPane.showInputDialog(null, "Choose monsters :", "Monsters",
                JOptionPane.PLAIN_MESSAGE, null, options, "Squirrel");
        if (n == "Squirrel") {
            novice.decreaseHP(montersList.getMonters(0).getDamage());
            novice.increaseEXP(montersList.getMonters(0).getExp());
            novice.getBag().squirrelMeat.setNumber(1);
        } else if (n == "Rabbit") {
            novice.decreaseHP(montersList.getMonters(1).getDamage());
            novice.increaseEXP(montersList.getMonters(1).getExp());
            novice.getBag().rabbitMeat.setNumber(1);
        } else if (n == "Hamster") {
            novice.decreaseHP(montersList.getMonters(2).getDamage());
            novice.increaseEXP(montersList.getMonters(2).getExp());
            novice.getBag().hamsterMeat.setNumber(1);
        }
        checkDead();
        novice.setKillMon();
    }

    public static void main(String[] args) {
        MainGameGUI gc = new MainGameGUI();
        gc.setName();
        gc.setType();
        gc.gui();
    }
}