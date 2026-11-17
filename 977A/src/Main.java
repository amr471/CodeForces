import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++){

            Integer n_integer = n;
            String n_string = n_integer.toString();
            int[] n1 =  new int[n_string.length()];
            for (int j = 0; j < n1.length; j++){
                n1[j] = n_string.charAt(j);
            }
            if (n1[n1.length -1] != '0'){
                n = n-1;
            }else n = n / 10;

        }
        System.out.println(n);
    }
}
