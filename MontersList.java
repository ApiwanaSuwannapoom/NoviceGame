import java.io.*;
import java.util.*;

public class MontersList {
    private ArrayList<Monters> monters;

    public MontersList() {
        monters = new ArrayList<Monters>();
        monters.add(new Monters("squirrel", 10, 50, 2));
        monters.add(new Monters("rabbit", 20, 70, 3));
        monters.add(new Monters("hamster", 30, 60, 4));
    }

    public Monters getMonters(int i) {
        return monters.get(i);
    }

    public void showMonters() {
        for (int i = 0; i < monters.size(); i++) {
            monters.get(i).showName();
        }
    }
}