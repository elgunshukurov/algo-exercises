package IngressUnibank.JavaComparator;

import java.util.Arrays;

public class PlayerMain {

    public static void main(String[] args) {
        Checker checker=new Checker();
        Player[] players = new Player[5];
        players[0]=new Player("amy",100);
        players[1]=new Player("david",100);
        players[2]=new Player("heraldo",50);
        players[3]=new Player("akansa",75);
        players[4]=new Player("aleksa",150);

        Arrays.sort(players,checker);

        for (int i = 0; i <players.length; i++) {
            System.out.println(players[i].name + " " + players[i].score);
        }
    }
}
