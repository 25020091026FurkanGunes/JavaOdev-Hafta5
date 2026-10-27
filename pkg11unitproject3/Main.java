package pkg11unitproject3;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
        Date d= new Date();
        Account a= new Account(1,10000,5,d);
        CheckingAccount c= new CheckingAccount(1,10000,5,d,500);
        SavingsAccount s= new SavingsAccount(1,10000,5,d,500);
        c.paraCek(500);
        System.out.println(a.toString());
        System.out.println(c.toString());
        System.out.println(s.toString());
    }
    
}
