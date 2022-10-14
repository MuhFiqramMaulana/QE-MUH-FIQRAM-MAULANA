public class Problem5B {
    private static String ubahHuruf(String s){
        int key = 10;
        String[] huruf = new String[26];
        for (char c ='A'; c<='Z';c++)
            huruf[c - 65] = String.valueOf(c);

        String cipher = "";
        loop1:
        for(int a = 0; a < s.length(); a++)
        {
            int index_plain = -1;
            for(int b = 0; b < huruf.length; b++)
            {
                index_plain = (String.valueOf(s.charAt(a)).equals(huruf[b])) ? b : -1;
                if(index_plain != -1)
                {
                    cipher += huruf[(index_plain + key) % 26];
                    continue loop1;
                }
            }
            cipher += s.charAt(a);
        }
        System.out.print(cipher + " : ");
        return s;
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));
    }
}

