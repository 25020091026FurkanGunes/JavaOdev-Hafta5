package pkg11unitproject3;
import java.util.Date;


public class CheckingAccount extends Account {
    double overdraft;

    public CheckingAccount(int hesapNo, double salary, double faiz, Date gun,double overdraft) {
        super(hesapNo, salary, faiz, gun);
        this.overdraft=overdraft; 
    }
    @Override
    public void paraCek(double miktar) {
        // Çekilecek miktar, bakiyeyi eksi limitin altına düşürmüyorsa işleme onay ver
        if (salary - miktar >= -overdraft) {
            salary -= miktar;
            System.out.println("Vadesiz Hesap: " + miktar + " TL çekildi. Yeni Bakiye: " + salary);
        } else {
            System.out.println("Vadesiz Hesap Hatası: Eksi bakiye limiti aşıldı! İşlem reddedildi.");
        }
    }

     
    @Override

    public String toString(){
    return "Bu bir Vadesiz Hesabidir. Guncel Bakiye: " + salary + " TL";  
 }
    
    
    
    
    
    
    
    
}
