/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11unitproject8;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Account hesap = new Account("Furkan", 1122, 1000);
        
        hesap.setAnnualInterestRate(1.5);
        
        hesap.deposit(30);
        hesap.deposit(40);
        hesap.deposit(50);
        
        hesap.withdraw(5);
        hesap.withdraw(4);
        hesap.withdraw(2);

        System.out.println("Müşteri Adı: " + hesap.getName());
        System.out.println("Hesap ID: " + hesap.getId());
        System.out.println("Yıllık Faiz Oranı: %" + hesap.getAnnualInterestRate());
        System.out.println("Güncel Bakiye: " + hesap.getBalance());
        
        System.out.println("\nİşlem Geçmişi:");
        for (Transaction islem : hesap.getTransactions()) {
            System.out.println("Tarih: " + islem.getDate() + 
                               " | İşlem Tipi: " + islem.getType() + 
                               " | Miktar: " + islem.getAmount() + 
                               " | Kalan Bakiye: " + islem.getBalance() + 
                               " | Açıklama: " + islem.getDescription());
        }
    }
}




