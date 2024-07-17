package PatternStringMatching;

class TrieNode {
    TrieNode[] children;
    boolean endOfWord;

    public TrieNode() {
        children = new TrieNode[26];
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        endOfWord = false;
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // O(L)
    public void insert(String word) {
        int level = 0;
        int length = word.length();
        int index = 0;
        TrieNode temp = root;

        while (level < length) {
            index = word.charAt(level) - 'a';
            if (temp.children[index] == null) {
                temp.children[index] = new TrieNode();
            }
            temp = temp.children[index];
            level++;
        }
        temp.endOfWord = true;
    }

    // O(L)
    public boolean search(String key) {
        int level = 0;
        int length = key.length();
        int index = 0;
        TrieNode curr = root;

        while (level < length) {
            index = key.charAt(level) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
            level++;
        }
        return curr.endOfWord;
    }

    // O(L)
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if(curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }
}
