package PatternStringMatching;

public class TrieUsage {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insert words into the Trie
        trie.insert("hello");
        trie.insert("world");
        trie.insert("hi");
        trie.insert("her");
        trie.insert("hero");

        // Search for words in the Trie
        System.out.println("Search results ~ ");
        System.out.println("hello: " + trie.search("hello")); // true
        System.out.println("world: " + trie.search("world")); // true
        System.out.println("hi: " + trie.search("hi")); // true
        System.out.println("her: " + trie.search("her")); // true
        System.out.println("hero: " + trie.search("hero")); // true
        System.out.println("hey: " + trie.search("hey")); // false
        System.out.println("helloo: " + trie.search("helloo")); // false
        System.out.println("he: " + trie.search("he")); // false
        System.out.println("hell: " + trie.search("hell")); // false
    }
}
