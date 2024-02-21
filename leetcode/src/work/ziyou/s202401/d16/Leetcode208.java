package work.ziyou.s202401.d16;

public class Leetcode208 {


    class Trie {

        private Trie[] tries;

        private boolean end;

        public Trie() {
            tries = new Trie[26];
            end = false;
        }

        public void insert(String word) {
            Trie root = this;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (null == root.tries[index]) {
                    root.tries[index] = new Trie();
                }
                root = root.tries[index];
            }
            root.end = true;
        }

        public boolean search(String word) {
            Trie root = this;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (null == root.tries[index]) {
                    return false;
                }
                root = root.tries[index];
            }
            return root != null && root.end;
        }

        public boolean startsWith(String prefix) {
            Trie root = this;
            for (char c : prefix.toCharArray()) {
                int index = c - 'a';
                if (null == root.tries[index]) {
                    return false;
                }
                root = root.tries[index];
            }
            return root != null;
        }
    }
}
