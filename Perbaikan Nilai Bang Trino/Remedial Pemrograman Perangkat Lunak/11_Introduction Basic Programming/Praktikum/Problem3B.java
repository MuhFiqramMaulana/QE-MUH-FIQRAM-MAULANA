public class Problem3B {
    private static void DrawXYZ(int n){
        int i,j;
        for (i = 1; i <= n; i++){
            for (j = 1; j <= n; j++){
                System.out.print("xyz" + i * j + "\t");
            }
            System.out.print("\n\n");
        }
    }

    public static void main(String[] args) {
        DrawXYZ(3);
    }
}
