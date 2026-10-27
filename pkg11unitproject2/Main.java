package pkg11unitproject2;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date tarih =new Date();
        ArrayList<Person> kisiler = new ArrayList<>();

        
        // Nesneleri .add() metodu ile listeye ekliyoruz
        kisiler.add(new Person("Ahmet Yilmaz", "Yenisehir", "ahmet@mail.com", 5551112233L));
        kisiler.add(new Student("Furkan Gunes", "Baglar", "furkan@mail.com", 5329998877L, 1));
        kisiler.add(new Employee("Ayse Demir", "Merkez", "ayse@mail.com", 5054445566L, "Ofis1", 25000,tarih));
        kisiler.add(new Faculty("Ugur Demiroglu", "Kampus", "ugur@mail.com", 5447778899L, "Müh. Fakültesi", 45000, tarih, 10-12, "Prof"));
        kisiler.add(new Staff("Ali Kaya", "Kampus", "ali@mail.com", 5556667788L, "Rektorluk", 22000, tarih, "Memur"));

            System.out.println(kisiler);
        
    }
        }


