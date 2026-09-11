class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<digits.length;i++)  
        {
            for(int j=0;j<digits.length;j++)
            {
                for(int k=0;k<digits.length;k++)
                {
      if(i==j || i==k || j==k)
      {
        continue;
      }
      if(digits[i]==0)
      continue;
      if(digits[k]%2!=0)
      continue;

      int number= digits[i]*100 + digits[j]*10 + digits[k];// 1 3 2 1*100= 100 3*10=30 2 => 100+30+2
//132;
set.add(number);

                }
            }
        }
        return set.size();
    }
}