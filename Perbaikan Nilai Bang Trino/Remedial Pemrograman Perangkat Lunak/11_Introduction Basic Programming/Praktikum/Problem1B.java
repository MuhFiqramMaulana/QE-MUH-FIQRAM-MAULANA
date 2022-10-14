public class Problem1B {
    private static int pangkat(int a, int b){
    int result = 1;
        while (b !=0) {
        result *= a;
        --b;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2,3));
        System.out.println(pangkat(5,3));
        System.out.println(pangkat(10,2));
        System.out.println(pangkat(2,5));
        System.out.println(pangkat(7,3));
    }
}
