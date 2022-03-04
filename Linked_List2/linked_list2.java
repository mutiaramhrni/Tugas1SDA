package Linked_List2;

import java.util.LinkedList;

public class linked_list2 {
    public static void main(String[] args) {
        LinkedList <String> nama = new LinkedList <String>();
        LinkedList <String> no_bp = new LinkedList <String>();
        LinkedList <String> alamat = new LinkedList <String>();

        System.out.println("");
        nama.add("Mutiara Maharani");
        no_bp.add("2111521006");
        alamat.add("Pariaman");
        System.out.println("Nama \t: " +nama);
        System.out.println("NIM \t: " +no_bp);
        System.out.println("Alamat \t: " +alamat);
        System.out.println("");

        System.out.println("=== Menambahkan Data Mahasiswa ===");
        //menambahkan data mahasiswa
        nama.addFirst("Nadia Suci");
        nama.add("Annisa Muthia");
        nama.add("Noni Aidilfitri");
        nama.add("Dina Murniati");
        nama.add("Dwi Kurnia");
        nama.addLast("Ade Amanda");
        System.out.println("Nama \t: "+nama+"\t Ukuran : "+nama.size());

        no_bp.addFirst("2111521010");
        no_bp.add("2111522015");
        no_bp.add("2111523020");
        no_bp.add("2111522019");
        no_bp.add("2111523010");
        no_bp.addLast("2111521014");
        System.out.println("NIM \t: "+no_bp+"\t\t\t Ukuran : "+no_bp.size());

        alamat.addFirst("Payakumbuh");
        alamat.add("Solok");
        alamat.add("Pasaman");
        alamat.add("Batusangkar");
        alamat.add("Tanah Datar");
        alamat.addLast("Bukittinggi");
        System.out.println("Alamat \t: "+alamat+"\t\t\t\t Ukuran : "+alamat.size());
        System.out.println("");

        System.out.println("==== Menghapus Data Mahasiswa ====");
        //menghapus data mahasiswa
        nama.removeFirst();
        nama.remove();
        nama.removeLast();
        System.out.println("Nama \t: "+nama+"\t Ukuran : "+nama.size());

        no_bp.removeFirst();
        no_bp.remove();
        no_bp.removeLast();
        System.out.println("NIM \t: "+no_bp+"\t\t Ukuran : "+no_bp.size());

        alamat.removeFirst();
        alamat.remove();
        alamat.removeLast();
        System.out.println("Alamat \t: "+alamat+"\t\t\t Ukuran : "+alamat.size());
        System.out.println("");

        System.out.println("=== Menyisipkan Data Mahasiswa ===");
        //menyisipkan data mahasiswa
        nama.set(0,"Shindy Yohanda");
        nama.set(2,"Zahira Maya");
        System.out.println("Nama \t: "+nama+"\t Ukuran : "+nama.size());
        no_bp.set(0,"2111522012");
        no_bp.set(2,"2111522022");
        System.out.println("NIM \t: "+no_bp+"\t\t Ukuran : "+no_bp.size());
        alamat.set(0,"Agam");
        alamat.set(2,"Dumai");
        System.out.println("Alamat \t: "+alamat+"\t\t\t\t Ukuran : "+alamat.size());
        System.out.println("");

        System.out.println("=== Mengeluarkan Data Mahasiswa ===");
        //mengeluarkan data mahasiswa
        nama.pop();
        nama.pop();
        System.out.println("Nama \t: "+nama+"\t Ukuran : "+nama.size());
        no_bp.pop();
        no_bp.pop();
        System.out.println("NIM \t: "+no_bp+"\t Ukuran : "+no_bp.size());
        alamat.pop();
        alamat.pop();
        System.out.println("Alamat \t: "+alamat+"\t\t Ukuran : "+alamat.size());
        System.out.println("");

        System.out.println("=== Memasukkan Data Mahasiswa ===");
        //memasukkan data mahasiswa
        nama.push("Indah Permata");
        nama.push("Nur Asyifa");
        nama.push("Nismayanti");
        System.out.println("Nama \t: "+nama+"\t Ukuran : "+nama.size());
        no_bp.push("2111521005");
        no_bp.push("2111523007");
        no_bp.push("2111521016");
        System.out.println("NIM \t: "+no_bp+"\t\t Ukuran : "+no_bp.size());
        alamat.push("Sawahlunto");
        alamat.push("Pekanbaru");
        alamat.push("Maninjau");
        System.out.println("Alamat \t: "+alamat+"\t\t\t Ukuran : "+alamat.size());
        System.out.println("");

        System.out.println("=== Pengecekkan Data Mahasiswa ===");
        //isEmpty
        System.out.println("Apakah data nama ada yang kosong?\t\t"+nama.isEmpty());
        System.out.println("Apakah data nim ada yang kosong?\t\t"+no_bp.isEmpty());
        System.out.println("Apakah data alamat ada yang kosong?\t\t"+alamat.isEmpty());
        System.out.println("");

        System.out.println("=== Mengetahui Indeks Data Mahasiswa ===");
        //indexof
        System.out.println("Nama Nur Asyifa index ke \t= "+nama.indexOf("Nur Asyifa"));
        System.out.println("Nim 2111521005 index ke \t= "+no_bp.indexOf(2111521005));
        System.out.println("Alamat Dumai index ke \t\t= "+alamat.indexOf("Dumai"));
        System.out.println("");


        System.out.println("=== Mencari Data Mahasiswa ====");
        //mencari data mahasiswa
        System.out.println("Nama : " +nama.getFirst()+ "  \tNIM : " +no_bp.getFirst()+ "  \tAlamat : " +alamat.getFirst());
        System.out.println("Nama : " +nama.get(2)+ "  \tNIM : " +no_bp.get(2)+ "  \tAlamat : " +alamat.get(2));
        System.out.println("Nama : " +nama.getLast()+ "  \tNIM : " +no_bp.getLast()+ "  \tAlamat : " +alamat.getLast());
        System.out.println("");  
    }
    
}
