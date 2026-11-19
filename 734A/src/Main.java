import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++){
            arr[i] = str.charAt(i);
        }

        int a = 0;
        int d = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 'A') a++;
            else if (arr[i] == 'D') d++;
        }
        if (a > d) System.out.println("Anton");
        else if (a <d ) System.out.println("Danik");
        else System.out.println("Friendship");

    }
}