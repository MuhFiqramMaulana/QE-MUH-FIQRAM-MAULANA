import java.util.Scanner;
public class Problem4 {
    private static Scanner sc;
    public static void main(String[] args) {
        int bilangan,i;
        sc = new Scanner(System.in);
        System.out.println("Masukkan Bilangan :");
        bilangan = sc.nextInt();
        System.out.println("Faktor-faktornya:");
        for(i = bilangan; i >= 1; i--) {
            if(bilangan%i == 0) {
                System.out.format(" %d  ", i);
            }
        }
    }
}
