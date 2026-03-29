class Solution {
    public boolean isValid(String s) {
        char c[]=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char ch:c)
        {
            if(ch =='('|| ch=='[' || ch=='{')
            stack.push(ch);
            else
            {
            if(stack.isEmpty())
            return false;
            char cc=stack.pop();
            if( cc=='(' && ch!=')' )
            return false;
          if( cc=='[' && ch!=']' )
                          return false;
           if( cc=='{' && ch!='}' )
                     return false;
            }
        }
return stack.isEmpty();
    }
}