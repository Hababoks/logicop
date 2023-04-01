import java.util.Scanner;

public class Main {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int a = con.nextInt();
        int b = con.nextInt();
        int c = con.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("треугольник существует");
        } else
            System.out.println("треугольник не существует");
    }

}
