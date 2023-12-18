import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainApp {
    public static void main(String[] args) {
        Random r=new Random();
        int a = r.nextInt(30);
        int b = r.nextInt(30);
        System.out.println(a+" "+b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("cmmdc: "+a);


    }
}