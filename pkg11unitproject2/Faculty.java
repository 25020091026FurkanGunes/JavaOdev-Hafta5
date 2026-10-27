package pkg11unitproject2;

import java.util.Date;


public class Faculty extends Employee {
    private double officeTime;
    private String rank;

   public Faculty(String name, String adress, String mail, long phone, String office,long salary,Date iseGiris, double officeTime, String rank) {
    // Person ve Employee'ye ait olan 7 bilgiyi Employee'ye (üst sınıfa) postalıyoruz
    super(name, adress, mail, phone, office, salary, iseGiris);
        this.officeTime = officeTime;
        this.rank = rank;
    }

   
    public double getOfficeTime() {
        return officeTime;
    }

  
    public void setOfficeTime(double officeTime) {
        this.officeTime = officeTime;
    }

    
    public String getRank() {
        return rank;
    }

    
    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
    
        return"Sinif: Faculty, Ad: " + getName();
    } 
    
   
    
}
