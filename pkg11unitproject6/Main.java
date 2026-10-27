
package pkg11unitproject6;


import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> liste = new ArrayList<>();

        liste.add(new Kredi(5.5, 10, 200000));
        liste.add(new Date());
        liste.add("Merhaba, bu bir String nesnesi!");
        liste.add(new Daire(5.0));

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i).toString());
        }
    }
}

class Kredi {
    private double yillikFaizOrani;
    private int yilSayisi;
    private double krediMiktari;

    public Kredi(double yillikFaizOrani, int yilSayisi, double krediMiktari) {
        this.yillikFaizOrani = yillikFaizOrani;
        this.yilSayisi = yilSayisi;
        this.krediMiktari = krediMiktari;
    }

    @Override
    public String toString() {
        return "Kredi [Miktar=" + krediMiktari + ", Faiz Oranı=" + yillikFaizOrani + "%, Yıl=" + yilSayisi + "]";
    }
}

class Daire {
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public String toString() {
        return "Daire [Yarıçap=" + yaricap + "]";
    }
}