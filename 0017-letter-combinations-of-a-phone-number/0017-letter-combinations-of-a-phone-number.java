  class Solution {

    public List<String> letterCombinations(String digits) {

         List<String> result=new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] map = {
            "",      
            "",      
            "abc",  
            "def",    
            "ghi",   
            "jkl",   
            "mno",   
            "pqrs", 
            "tuv",   
            "wxyz"   
        };

        backtrack(0, digits, map, new StringBuilder(), result);

        return result;
    }

    private void backtrack(
        int index,
        String digits,
        String[] map,
        StringBuilder current,
        List<String> result
    ) {

         
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
 
        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {

            current.append(c);

             
            backtrack(index + 1, digits, map, current, result);

             
            current.deleteCharAt(current.length() - 1);
        }
    }
}



