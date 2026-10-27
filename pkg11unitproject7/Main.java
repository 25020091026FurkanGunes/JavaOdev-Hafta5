
package pkg11unitproject7;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            liste.add(i);
        }

        System.out.println(liste);
        
        shuffle(liste);
        
        System.out.println(liste);
    }

    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int rastgeleIndeks = (int) (Math.random() * list.size());
            
            int gecici = list.get(rastgeleIndeks);
            list.set(rastgeleIndeks, list.get(i));
            list.set(i, gecici);
        }
    }
}