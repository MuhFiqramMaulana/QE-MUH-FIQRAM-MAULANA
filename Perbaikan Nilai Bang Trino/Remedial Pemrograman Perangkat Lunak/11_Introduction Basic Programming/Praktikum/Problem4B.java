public class Problem4B {
    private static void cetakTablePerkalian(int n){
        int i,j;
        for (i = 1; i <= n; i++){
            for (j = 1; j <= n; j++){
                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n\n");
        }
    }

    public static void main(String[] args) {
        cetakTablePerkalian(9);
    }
}
