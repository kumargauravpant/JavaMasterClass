package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ISaveable player = new Player("Gaurav", 10, 100);
        System.out.println(player.toString());
        saveObject(player);

        ((Player) player).setHitPoints(20);
        saveObject(player);
        ((Player) player).setWeapon("Gun");
        saveObject(player);

        loadObject(player);
        saveObject(player);



    }

    public static void saveObject(ISaveable values) {
        if (values != null && values.write().size() > 0) {
            for (int i=0; i<values.write().size(); i++) {
                System.out.println("Loading " + values.write().get(i) + " to disk");
            }
        }
    }

    public static void loadObject(ISaveable object) {
        List<String> values = new ArrayList<String>();
        values.add(0,"Jay");
        values.add(1,""+ 30);
        values.add(2,""+ 70);
        values.add(3,"Knife");
        object.read(values);
    }
}
