import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int a =sc.nextInt();
        for (int i = 5; i > 0; i--){
            c += a/i;
            a = a % i;
        }
        System.out.println(c);
    }
}