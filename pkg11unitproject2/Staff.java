package pkg11unitproject2;
import java.util.Date;

public class Staff extends Employee {
 
    private String tittle;
    
  
   public Staff(String name, String adress, String mail, long phone, String office,long salary,Date iseGiris, String tittle) {
    super(name, adress, mail, phone, office, salary, iseGiris);
    this.tittle=tittle;
    }
     
    public String getTittle() {
        return tittle;
    }
    
    @Override
    public String toString(){
    
        return"Sinif: Staff, Ad: " + getName();
    } 

  
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

   
}
