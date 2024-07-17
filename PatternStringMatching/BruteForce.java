package PatternStringMatching;

public class BruteForce {
    public static void main(String[] args) {
        String text = "ababaababbabbbaaab";
        String pat = "aab";
        int m = pat.length();
        int n = text.length();

        for (int i = 0; i + m <= n; i++) {
            if (text.substring(i, i + m).equals(pat)) {
                System.out.println(i);
            }
        }
    }
}

