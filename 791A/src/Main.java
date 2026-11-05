import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Limak = sc.nextInt();
        int Bob = sc.nextInt();
        int c= 0;
        if (Limak == Bob){
            System.out.println(1);
        }else if(Bob > Limak){
            while (Bob >= Limak){
                Limak = Limak *3;
                Bob = Bob*2;
                c++;
            }
            System.out.println(c);
        }

    }
}