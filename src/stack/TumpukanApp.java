/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author GESREK123
 */
public class TumpukanApp {
        public static void main(String[] args) {
      
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(10);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        long bacaTop = tumpukan.peek();
        System.out.println("nilai top = "+bacaTop);
        System.out.println("\nNama saya adalah Solchan Refwi Al Habib\n");
        tumpukan.pop();
        tumpukan.baca();

        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
    }
}

