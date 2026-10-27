package pkg11unitproject3;
import java.util.Date;

public class Account {
    int hesapNo;
    double salary;
    double faiz;
    Date gun=new Date();

    public Account(int hesapNo, double salary, double faiz, Date gun) {
        this.hesapNo = hesapNo;
        this.salary = salary;
        this.faiz = faiz;
        this.gun = gun;
    }
    public void paraCek(double cek){
     salary=salary-cek;
    } 
    public void parayatir(double yatir){
     salary=salary+yatir;
    } 
    @Override
    public String toString(){
    return "Bu ana hesaptir";
    }
}
