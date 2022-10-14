public class Problem2B {
    private static void playWithAsterisk(int n){
        int i,j,k;
        for(i = 0; i< n; i++){
            for(j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for (k = 0; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}
