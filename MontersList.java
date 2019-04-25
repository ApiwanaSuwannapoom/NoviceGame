import java.io.*;
import java.util.*;

public class MontersList {
    private ArrayList<Monters> monters;

    public MontersList() {
        monters = new ArrayList<Monters>();
        monters.add(new Monters("squirrel", 20, 50, 2));
        monters.add(new Monters("rabbit", 30, 70, 3));
        monters.add(new Monters("hamster", 50, 60, 4));
    }

    public Monters getMonters(int i) {
        return monters.get(i);
    }
}