import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int age = con.nextInt();
        if (age <20 || age >60){
            System.out.println("можно не работать");
        }

    }
}