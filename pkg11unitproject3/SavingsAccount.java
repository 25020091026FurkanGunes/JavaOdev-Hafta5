package pkg11unitproject3;
import java.util.Date;

public class SavingsAccount extends Account {

    public SavingsAccount(int hesapNo, double salary, double faiz, Date gun,double overdraft) {
        
            super(hesapNo, salary, faiz, gun);
           
        } 
        @Override

    public void paraCek(double miktar) {
        if (salary - miktar >= 0) {
            salary -= miktar;
            System.out.println("Tasarruf Hesabı: " + miktar + " TL çekildi. Yeni Bakiye: " + salary);
        } else {
            System.out.println("Tasarruf Hesabı Hatası: Yetersiz bakiye! Eksiye düşülemez.");
        } 
    }
     
    @Override

    public String toString(){
    return "Bu bir Tasarruf Hesabidir. Guncel Bakiye: " + salary + " TL";  
 }
    }
    
    
    
    

