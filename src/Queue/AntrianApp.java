/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author GESREK123
 */
public class AntrianApp {
      public static void main(String[] args) {
        Antrian newQueue = new Antrian(10);
        newQueue.enqueue(50);
        newQueue.display();
        newQueue.enqueue(60);
        newQueue.display();
        System.out.println("data paling depan = "+newQueue.peek());
        System.out.println("\nNama saya Solchan Refqi Al Habib\n");

        newQueue.enqueue(70);
        newQueue.display();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.display();
        System.out.println("data paling depan = "+newQueue.peek());
    }
}

