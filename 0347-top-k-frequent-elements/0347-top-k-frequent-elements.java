class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i=0;i<bucket.length;i++)
        {
            bucket[i]=new ArrayList<>();
        }

        for(int num:map.keySet())
        {
            
          bucket[map.get(num)].add(num);
           
        }
int[] res=new int[k];
int index=0;
        for(int i=bucket.length-1;i>0;i--)
        {
            List<Integer> l=bucket[i];
            if(l!=null)
            {
           for(int j=0;j<l.size() && index<k ;j++)
           { res[index++]=l.get(j);

            if(index==k)
            {
           
            break;
            }
            
           }
            }
        }
        return res;
    }
}