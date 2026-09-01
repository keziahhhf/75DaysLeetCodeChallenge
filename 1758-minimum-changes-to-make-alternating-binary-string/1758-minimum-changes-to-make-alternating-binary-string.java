class Solution {
    public int minOperations(String s) {
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
            if(s.charAt(i)!='0')
            count1++;
            }
            else
            {
                if(s.charAt(i)!='1')
            count2++;
            }


        }
        int poss1=count1+count2;
        int res=Math.min(poss1,s.length()-poss1);
        return res;
    }
}