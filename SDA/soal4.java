import java.util.ArrayList;

public class soal4 {
    public static void main(String[] args) {
         //String[] nama= {"r","a","n","i"};

         ArrayList<String> nama = new ArrayList<String>();
         nama.add("r");
         nama.add("a");
         nama.add("n");
         nama.add("i");
         
        //Tentukan hasil yang didapatkan ketika dilakukan perintah    
        // indexOf(a), indexOf(c), indexOf(q)
 
         System.out.println(nama.indexOf("a"));
         System.out.println(nama.indexOf("c"));
         System.out.println(nama.indexOf("q"));
    }
    
}
