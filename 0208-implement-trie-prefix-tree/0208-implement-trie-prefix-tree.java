class Trie {

        class TrieNode {
                TrieNode[] children = new TrieNode[26];
                        boolean isEnd = false;
                            }

                                TrieNode root;

                                    public Trie() {
                                            root = new TrieNode();
                                                }

                                                    // Insert a word
                                                        public void insert(String word) {
                                                                TrieNode node = root;

                                                                        for (int i = 0; i < word.length(); i++) {
                                                                                    char ch = word.charAt(i);
                                                                                                int index = ch - 'a';

                                                                                                            if (node.children[index] == null) {
                                                                                                                            node.children[index] = new TrieNode();
                                                                                                                                        }

                                                                                                                                                    node = node.children[index];
                                                                                                                                                            }

                                                                                                                                                                    node.isEnd = true;
                                                                                                                                                                        }

                                                                                                                                                                            // Search full word
                                                                                                                                                                                public boolean search(String word) {
                                                                                                                                                                                        TrieNode node = root;

                                                                                                                                                                                                for (int i = 0; i < word.length(); i++) {
                                                                                                                                                                                                            char ch = word.charAt(i);
                                                                                                                                                                                                                        int index = ch - 'a';

                                                                                                                                                                                                                                    if (node.children[index] == null) {
                                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                            node = node.children[index];
                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                            return node.isEnd;
                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                    // Check prefix
                                                                                                                                                                                                                                                                                                        public boolean startsWith(String prefix) {
                                                                                                                                                                                                                                                                                                                TrieNode node = root;

                                                                                                                                                                                                                                                                                                                        for (int i = 0; i < prefix.length(); i++) {
                                                                                                                                                                                                                                                                                                                                    char ch = prefix.charAt(i);
                                                                                                                                                                                                                                                                                                                                                int index = ch - 'a';

                                                                                                                                                                                                                                                                                                                                                            if (node.children[index] == null) {
                                                                                                                                                                                                                                                                                                                                                                            return false;
                                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                                                    node = node.children[index];
                                                                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        }
