import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] nick = new String[str.length()];

        int count = 0;
        for (int i = 0; i < str.length(); i++){
            boolean isBefore = false;
            for (int j = 0; j < i; j++){
                if (str.charAt(j) == str.charAt(i)){
                    isBefore = true;
                }
            }
            if (!isBefore){
                count++;
            }
        }



        if (count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }

    }
}
