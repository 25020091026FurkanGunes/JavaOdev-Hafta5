package pkg11unitproject2;


public class Student extends Person {
 public static final int BIRINCI_SINIF = 1;
    public static final int IKINCI_SINIF = 2;
    public static final int UCUNCU_SINIF = 3;
    public static final int DORDUNCU_SINIF = 4;

    // 2. O anki öğrencinin sınıfını tutacak tek bir değişken yeterlidir
    private int sinifDurumu;

    public Student( String name, String adress, String mail, long phone,int sinifDurumu) {
        super(name, adress, mail, phone);
        this.sinifDurumu = sinifDurumu;
    }


    
    public int getSinifDurumu() {
        return sinifDurumu;
    }

   
    public void setSinifDurumu(int sinifDurumu) {
        this.sinifDurumu = sinifDurumu;
    }
    @Override
    public String toString(){
    
        return "Sinif: Student, Ad: " + getName() ;
    } 
}
