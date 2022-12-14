package IngressUnibank.JavaComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Checker implements Comparator<Player> {


    @Override
    public int compare(Player a, Player b) {
        if (a.score == b.score){
            return a.name.compareTo(b.name);//alphabetically
        } else {
            return b.score - a.score;//decreasing
        }
    }
}
