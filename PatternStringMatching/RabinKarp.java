package PatternStringMatching;

public class RabinKarp {

    static final long p = 31;
    static final long mod = 1000000007;

    public static long polyHash(String s) {
        long hash = 0;
        long pPower = 1;

        for (int i = 0; i < s.length(); i++) {
            hash = (hash + (s.charAt(i) - 'a' + 1) * pPower) % mod;
            pPower = (pPower * p) % mod;
        }

        return hash;
    }

    public static long powr(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) res = (res * a) % mod;
            b >>= 1;
            a = (a * a) % mod;
        }
        return res;
    }

    public static long inv(long x) {
        return powr(x, mod - 2);
    }

    public static void main(String[] args) {
        String text = "ababbabbaba";
        String pattern = "aba";

        long patHash = polyHash(pattern);

        int n = text.length();
        int m = pattern.length();

        long textHash = polyHash(text.substring(0, m));

        if (patHash == textHash) {
            System.out.println(0);
        }

        for (int i = 1; i + m <= n; i++) {
            // Remove last character
            textHash = (textHash - (text.charAt(i - 1) - 'a' + 1) + mod) % mod;
            textHash = (textHash * inv(p)) % mod;
            textHash = (textHash + (text.charAt(i + m - 1) - 'a' + 1) * powr(p, m - 1)) % mod;

            if (textHash == patHash) {
                System.out.println(i);
            }
        }
    }
}
