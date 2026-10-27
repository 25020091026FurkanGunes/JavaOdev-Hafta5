/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg11unitproject9;

import java.util.ArrayList;
import java.util.Scanner;

// 2. Bölüm: 11.9 (Largest rows and columns)
public class LargestRowAndColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matris boyutu için n değerini girin: ");
        int n = input.nextInt();
        
        int[][] matrix = new int[n][n];
        
        System.out.println("Rastgele matris:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
        // En çok 1 içeren satırları bulma
        ArrayList<Integer> maxRows = new ArrayList<>();
        int maxRowCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxRowCount) {
                maxRowCount = count;
                maxRows.clear();
                maxRows.add(i);
            } else if (count == maxRowCount) {
                maxRows.add(i);
            }
        }
        
        // En çok 1 içeren sütunları bulma
        ArrayList<Integer> maxCols = new ArrayList<>();
        int maxColCount = 0;
        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxColCount) {
                maxColCount = count;
                maxCols.clear();
                maxCols.add(j);
            } else if (count == maxColCount) {
                maxCols.add(j);
            }
        }
        
        // ArrayList'lerin formatlı yazdırılması
        System.out.println("En çok 1 içeren satır indeksleri: " + formatList(maxRows));
        System.out.println("En çok 1 içeren sütun indeksleri: " + formatList(maxCols));
    }
    
    // Köşeli parantezleri kaldırarak örnek çıktıya uygun yazdırmak için yardımcı metot
    private static String formatList(ArrayList<Integer> list) {
        return list.toString().replace("[", "").replace("]", "");
    }
}