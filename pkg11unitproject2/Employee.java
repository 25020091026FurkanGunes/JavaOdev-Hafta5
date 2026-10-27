package pkg11unitproject2;
import java.util.Date;

public class Employee extends Person {
    String office;
    long salary;
    Date gun=new Date();

    public Employee() {
    }

    

    public Employee(String office, long salary, Date gun) {

        this.office = office;
        this.salary = salary;
        this.gun = gun;
    }
    

    public Employee( String name, String adress, String mail, long phone,String office, long salary, Date gun) {
        super(name, adress, mail, phone);
        this.office = office;
        this.salary = salary;
        this.gun = gun;
    }
    @Override
    public String toString(){
    
        return"Sinif: Employee, Ad: " + getName();
    } 

   
    
    
}
