package PatternStringMatching;

public class TriePatternMatching {
    public static void main(String[] args) {
        // Sample input strings
        String text = "ababba";
        String pat = "aba";

        // Initialize Trie
        Trie trie = new Trie();

        // Insert all suffixes of text into Trie
        int n = text.length();
        for (int i = 0; i < n; i++) {
            trie.insert(text.substring(i));
        }

        // Search for the pattern in the Trie
        if (trie.startsWith(pat)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        // To find all indexes where this pattern is found
    }
}
