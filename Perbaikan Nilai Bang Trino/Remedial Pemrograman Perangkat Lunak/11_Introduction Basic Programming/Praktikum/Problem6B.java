import java.util.Scanner;
public class Problem6B {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("##  Program Java Cari Nilai Rata-rata  ##");
        System.out.println("========================================");
        System.out.println();

        int[] arr = new int[100];
        int arr_count, i;
        float total, rata2;

        System.out.print("Input jumlah element array: ");
        arr_count = input.nextInt();

        System.out.println("Input "+arr_count+" angka (dipisah dengan enter):");

        for(i = 0; i < arr_count; i++){
            arr[i] = input.nextInt();
        }

        System.out.println();

        total = 0;
        for(i = 0; i < arr_count; i++){
            total = total+arr[i];
        }

        rata2 = (total/arr_count);
        System.out.println("Nilai rata-rata dari "+ arr_count +
                " inputan adalah: "+ rata2);

    }
}
