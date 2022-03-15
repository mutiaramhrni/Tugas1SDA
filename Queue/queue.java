package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("Nama \t: Mutiara Maharani");
        System.out.println("NIM \t: 2111521006");
        System.out.println("Materi \t: Queue");
        System.out.println("----------------------------");
        System.out.println("");

        Integer angka;
        int i=0;
        boolean bool = true;

        Queue<Integer> antrian = new LinkedList<>(); //deklarasi queue
        
        Scanner pilih = new Scanner(System.in);

        System.out.println("Menu Pilihan");
        System.out.println("-------------");

        do{
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Elemen Paling Awal");
            System.out.println("4. Apakah ada Queue kosong? ");
            System.out.println("5. Banyaknya Antrian ");
            System.out.println("6. Tampilkan Queue");
            System.out.println("7. Selesai");
            System.out.print("Masukkan Pilihan [1-6]: ");
            int input=pilih.nextInt();
            switch(input){
                case 1:
                    System.out.print("Banyak data yang akan di Enqueue: ");
                    i=0;
                    int h=pilih.nextInt();
                    do{
                        System.out.print("Masukan angka: ");
                        angka=pilih.nextInt();
                        antrian.add(angka);
                        i++;
                    }
                    while(i<h);
                    System.out.println("Queue: "+antrian);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Ambil elemen: "+antrian.poll()); //bisa menggunakan method poll()
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Elemen paling awal: "+antrian.peek()); //bisa menggunakan method element()
                    System.out.println("");
                    break;

               case 4:
                    System.out.println("Apakah Queue kosong? "+antrian.isEmpty());
                    System.out.println("");
                    break;

                case 5:  
                    System.out.println("Banyak Antrian " +antrian.size());
                    System.out.println("");
                    break;  

                case 6:
                    System.out.println("Queue: "+antrian);
                    System.out.println("");
                    break;

                case 7:
                    System.exit(0);
                    break;
                
                default:
                System.err.println("Pilihan tidak tersedia!");
                System.out.println("");
            }
        }
        while(bool);
        
    }
    
}
