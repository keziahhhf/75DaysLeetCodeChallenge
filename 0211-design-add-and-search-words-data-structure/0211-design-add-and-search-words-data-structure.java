//Design Add and Search Words 
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */


 class WordDictionary {
        
            private TrieNode root;
                
                    private static class TrieNode {
                            TrieNode[] children = new TrieNode[26];
                                    boolean isEnd = false;
                                        }
                                            
                                                public WordDictionary() {
                                                        root = new TrieNode();
                                                            }
                                                                
                                                                    // O(m) time — m = word length
                                                                        public void addWord(String word) {
                                                                                TrieNode node = root;
                                                                                        for (char ch : word.toCharArray()) {
                                                                                                    int i = ch - 'a';
                                                                                                                if (node.children[i] == null) {
                                                                                                                                node.children[i] = new TrieNode();
                                                                                                                                            }
                                                                                                                                                        node = node.children[i];
                                                                                                                                                                }
                                                                                                                                                                        node.isEnd = true;
                                                                                                                                                                            }
                                                                                                                                                                                
                                                                                                                                                                                    // O(m) best case, O(26^m) worst case (all dots)
                                                                                                                                                                                        public boolean search(String word) {
                                                                                                                                                                                                return dfs(word, 0, root);
                                                                                                                                                                                                    }
                                                                                                                                                                                                        
                                                                                                                                                                                                            private boolean dfs(String word, int i, TrieNode node) {
                                                                                                                                                                                                                    if (i == word.length()) {
                                                                                                                                                                                                                                return node.isEnd;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                        char ch = word.charAt(i);
                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                        if (ch == '.') {
                                                                                                                                                                                                                                                                                    // Wildcard: try every child
                                                                                                                                                                                                                                                                                                for (TrieNode child : node.children) {
                                                                                                                                                                                                                                                                                                                if (child != null && dfs(word, i + 1, child)) {
                                                                                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                            return false;
                                                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                                                                // Exact match
                                                                                                                                                                                                                                                                                                                                                                                                            int idx = ch - 'a';
                                                                                                                                                                                                                                                                                                                                                                                                                        if (node.children[idx] == null) return false;
                                                                                                                                                                                                                                                                                                                                                                                                                                    return dfs(word, i + 1, node.children[idx]);
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
 