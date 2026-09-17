class Solution {
    public int compress(char[] chars) {
        int write=0;
        int i=0;
        while(i<chars.length)
        {
            char current = chars[i];
            int count =0;
            while(i<chars.length && chars[i]==current)
            {
                i++;
                count++;
            }
            chars[write++]=current;
            if(count>1)
            {
                String countstr=String.valueOf(count);
                for(char c:countstr.toCharArray())
                {
                    chars[write++]=c;
                }
            }
        }
        return write;
    }
}