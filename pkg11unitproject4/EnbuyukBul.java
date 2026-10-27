package pkg11unitproject4;

import java.util.ArrayList;


public class EnbuyukBul {

  ArrayList<Integer> sayilar;
  public EnbuyukBul(){
  this.sayilar=new ArrayList<>();
  }
  public void sayiEkle(int sayi){
      sayilar.add(sayi);
  }
    public void elemanGir(){
    
    for(int i = 0;i<sayilar.size();i++){
    sayilar.add(i);
    if(sayilar.size()-1!=0){
        System.out.println("Yanlıs deger girildi son sayi 0 olsun");
    }
    
        System.out.println(sayilar);
    }
    }
    }
        

