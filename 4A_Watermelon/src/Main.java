import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 100 && num >= 1){
            int res = num % 2;
            if (res == 0 && num > 2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}