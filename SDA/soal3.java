import java.util.ArrayList;

public class soal3 {
    public static void main(String[] args) {
        //String []nama = {"R", "A", "N", "I"};

        ArrayList<String> nama = new ArrayList<String>();
        nama.add("R");
        nama.add("A");
        nama.add("N");
        nama.add("I");
       
        //Tentukan hasil yang didapatkan ketika dilakukan perintah 
        //get(0), get(2), get(6), get(-3)
       
        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));

    }
    
}
