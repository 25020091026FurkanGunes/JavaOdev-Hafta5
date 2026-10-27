package pkg11unitproject4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    ArrayList<Integer>sayilar=new ArrayList<>();
        while(true){
        int sayi=s.nextInt();
        if(sayi==0){
            System.out.println("0 girildi");
            break;
        }
        
        sayilar.add(sayi);
        }
        if(sayilar.isEmpty()){
            System.out.println("Sayi yok");
        }
        int enBuyuk=0;
        for(int i=0;i<sayilar.size();i++){
        int sayi2=sayilar.get(i);
        if(sayi2>enBuyuk){
        enBuyuk=sayi2;
        }
         }
                System.out.println(sayilar);
                System.out.println(enBuyuk);



    }

}
