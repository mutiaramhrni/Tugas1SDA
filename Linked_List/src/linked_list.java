package Linked_List.src;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {

        LinkedList <String> saya = new LinkedList<String>();
        saya.add("M");
        saya.add("U");
        saya.add("T");
        saya.add("I");
        saya.add("A");
        saya.add("R");
        saya.add("A");
        saya.add("");
        saya.add("M");
        saya.add("A");
        saya.add("H");
        saya.add("A");
        saya.add("R");
        saya.add("A");
        saya.add("N");
        saya.add("I");

        System.out.println("Nama Saya = " +saya);
        System.out.println("size : "+saya.size());

        //Add LinkedList
        saya.addFirst("A");
        saya.addLast("M");
        saya.add("I");
        saya.add("A");
        System.out.println("\noutput tambah = "+saya);
        System.out.println("size : "+saya.size());

        //set LinkedList
        saya.set(0,"X");
        saya.set(3,"R");
        saya.set(6,"Y");
        saya.set(11,"P");
        saya.set(17,"S");
        System.out.println("output sisip = "+saya);
        System.out.println("size : "+saya.size());

        //remove LinkedList
        saya.removeFirst();
        saya.removeLast();
        System.out.println("output hapus = "+saya);
        System.out.println("size = "+saya.size());

        saya.remove(17);
        saya.remove(13);
        saya.remove(4);
        saya.remove(2);
        saya.remove(10);
        System.out.println("output hapus = "+saya);
        System.out.println("size : "+saya.size());

        //Pop LinkedList
        saya.pop();
        saya.pop();
        System.out.println("output pop = "+saya);
        System.out.println("size : "+saya.size());

        //Push LinkedList
        saya.push("C");
        saya.push("A");
        saya.push("F");
        System.out.println("output push = "+saya);
        System.out.println("size : "+saya.size());

    }
    
}
