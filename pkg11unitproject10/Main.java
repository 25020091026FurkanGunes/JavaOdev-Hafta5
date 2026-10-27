
package pkg11unitproject10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack<String> stack = new MyStack<>();

        System.out.print("5 adet kelime giriniz: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        System.out.println("Kelimelerin ters sırayla yazılışı:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

// MyStack sınıfı doğrudan ArrayList'ten kalıtım (inheritance) alır
class MyStack<E> extends ArrayList<E> {
    
    // Yığının en üstüne eleman ekler
    public void push(E o) {
        add(o); // ArrayList'in add metodunu miras aldığımız için doğrudan kullanabiliyoruz
    }

    // Yığının en üstündeki elemanı silmeden döndürür
    public E peek() {
        return get(size() - 1); // ArrayList'in get ve size metotları miras alındı
    }

    // Yığının en üstündeki elemanı döndürür ve listeden siler
    public E pop() {
        E o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    @Override
    public String toString() {
        return "Yığın: " + super.toString();
    }
}