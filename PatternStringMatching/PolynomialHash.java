package PatternStringMatching;

public class PolynomialHash {
    public static long polyHash(String s) {
        long hash = 0;
        int p = 31;
        long mod = 1000000007;
        long pPower = 1;

        for (int i = 0; i < s.length(); i++) {
            hash = (hash + (s.charAt(i) - 'a' + 1) * pPower) % mod;
            pPower = (pPower * p) % mod;
        }

        return hash;
    }

    public static void main(String[] args) {
        // Example usage
        String s = "ababa";
        System.out.println("Hash: " + polyHash(s));
    }
}
