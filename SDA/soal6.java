import java.util.ArrayList;

public class soal6 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("r");
        nama.add("a");
        nama.add("n");
        nama.add("i");

        nama.add(0,"e");
        System.out.println("add e ="+nama);

        nama.add(2,"f");
        System.out.println("add f ="+nama);

        nama.add(3,"g");
        System.out.println("add g ="+nama);

        nama.add(4,"h");
        System.out.println("add h ="+nama);

        nama.add(6,"h");
        System.out.println("add h ="+nama);

        nama.add(-3,"j");
        System.out.println("add e ="+nama);
    }
    
}
